package com.ecp.common.feign;

import com.ecp.common.entity.TAcAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: DELL
 * @Date: 2020/9/27 14:45
 * @Description:
 */
@Component
@FeignClient(name = "nacos-consumer",path = "/tAcAccount")
public interface TacAccountFeignClient {

    @PostMapping("getAccountById")
    TAcAccount getAccountById(@RequestParam("accountId") String accountId);

    @PostMapping()
    TAcAccount getAccountByEntity(@RequestBody TAcAccount tAcAccount);

}
