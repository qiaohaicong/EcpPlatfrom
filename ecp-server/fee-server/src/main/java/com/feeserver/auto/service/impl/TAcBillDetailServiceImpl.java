package com.feeserver.auto.service.impl;

import com.ecp.common.entity.TAcBillDetail;
import com.feeserver.auto.mapper.TAcBillDetailMapper;
import com.feeserver.auto.service.TAcBillDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 每月产生一条账单数据，包含账单里面所有的内容 服务实现类
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Service
public class TAcBillDetailServiceImpl extends ServiceImpl<TAcBillDetailMapper, TAcBillDetail> implements TAcBillDetailService {

}
