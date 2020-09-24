package com.wy.server.auto.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ecp.common.entity.TcBuilding;
import com.wy.server.auto.service.TcBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("getTcBuildingByid")
    public TcBuilding getTcBuildingByid(){
        return tcBuildingService.getTcBuildingByid("00000926-0bf5-4a9a-a521-75a850f11a53");
    }

    @PostMapping("listPageTcBuilding")
    public List<TcBuilding> listPageTcBuilding(){
        Page<TcBuilding> page = new Page<>(1,10);
        return tcBuildingService.listPageTcBuilding(page);
    }

}

