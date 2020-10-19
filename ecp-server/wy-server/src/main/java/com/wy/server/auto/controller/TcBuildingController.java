package com.wy.server.auto.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ecp.common.entity.TAcAccount;
import com.ecp.common.entity.TcBuilding;
import com.ecp.common.feign.TacAccountFeignClient;
import com.wy.server.auto.service.TcBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.PipedReader;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@RestController
@RequestMapping("/tcBuilding")
public class TcBuildingController {

    @Autowired
    private TcBuildingService tcBuildingService;

    private final RestTemplate restTemplate;

    @Autowired
    public TcBuildingController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Autowired
    private TacAccountFeignClient tacAccountFeignClient;

    @PostMapping("getTcBuildingByid")
    public TAcAccount getTcBuildingByid(){
        //使用feign 方式调用
        TAcAccount tAcAccountT = tacAccountFeignClient.getAccountById("0003DD9DDD3911E99F5C00163E02C1D2");
        return tAcAccountT;
    }

    public TAcAccount getTcBuildingByEntity(){
        TAcAccount paraAccount = new TAcAccount();
        paraAccount.setId("82907CAEDD3911E99F5C00163E02C1D2");
        return tacAccountFeignClient.getAccountByEntity(paraAccount);
    }

    @PostMapping("listPageTcBuilding")
    public List<TcBuilding> listPageTcBuilding(){
        Page<TcBuilding> page = new Page<>(1,10);
        return tcBuildingService.listPageTcBuilding(page);
    }

}

