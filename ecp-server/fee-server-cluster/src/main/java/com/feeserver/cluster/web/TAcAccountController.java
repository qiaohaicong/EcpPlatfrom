package com.feeserver.cluster.web;


import com.ecp.common.entity.TAcAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 资产账户，一处资产信息对应一个账户（总账户） 前端控制器
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@RestController
@RequestMapping("/tAcAccount")
public class TAcAccountController {

    @Autowired
    private TAcAccountService tAcAccountService;

    @PostMapping("getAccountById")
    public TAcAccount getAccountById(@RequestParam("accountId") String accountId){
        return tAcAccountService.getAccountById(accountId);
    }

    @PostMapping("getAccountByEntity")
    public TAcAccount getAccountByEntity(@RequestBody TAcAccount tAcAccount){
        return tAcAccountService.getAccountById(tAcAccount.getId());
    }

}

