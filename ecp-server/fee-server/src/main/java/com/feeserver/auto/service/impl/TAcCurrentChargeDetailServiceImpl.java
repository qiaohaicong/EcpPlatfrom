package com.feeserver.auto.service.impl;

import com.ecp.common.entity.TAcCurrentChargeDetail;
import com.feeserver.auto.mapper.TAcCurrentChargeDetailMapper;
import com.feeserver.auto.service.TAcCurrentChargeDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 各个资产每月的计费明细记录，也作为账单获取数据的依据 服务实现类
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Service
public class TAcCurrentChargeDetailServiceImpl extends ServiceImpl<TAcCurrentChargeDetailMapper, TAcCurrentChargeDetail> implements TAcCurrentChargeDetailService {

}
