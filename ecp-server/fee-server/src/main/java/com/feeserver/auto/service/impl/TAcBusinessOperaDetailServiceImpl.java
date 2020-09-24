package com.feeserver.auto.service.impl;

import com.ecp.common.entity.TAcBusinessOperaDetail;
import com.feeserver.auto.mapper.TAcBusinessOperaDetailMapper;
import com.feeserver.auto.service.TAcBusinessOperaDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 前台每操作一笔资金相关的业务,记录一条流水明细 服务实现类
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Service
public class TAcBusinessOperaDetailServiceImpl extends ServiceImpl<TAcBusinessOperaDetailMapper, TAcBusinessOperaDetail> implements TAcBusinessOperaDetailService {

}
