package com.feeserver.auto.service.impl;

import com.ecp.common.entity.TAcAccount;
import com.feeserver.auto.mapper.TAcAccountMapper;
import com.feeserver.auto.service.TAcAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资产账户，一处资产信息对应一个账户（总账户） 服务实现类
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Service
public class TAcAccountServiceImpl extends ServiceImpl<TAcAccountMapper, TAcAccount> implements TAcAccountService {

}
