package com.wy.server.auto.service.impl;

import com.wy.server.auto.entity.TJfChargingItemTotalInfo;
import com.wy.server.auto.mapper.TJfChargingItemTotalInfoMapper;
import com.wy.server.auto.service.TJfChargingItemTotalInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 单个计费项当月的计费，审核，抵扣，托收，情况信息，单个计费项单月的一个汇总情况 服务实现类
 * </p>
 *
 * @author qhc
 * @since 2020-09-15
 */
@Service
public class TJfChargingItemTotalInfoServiceImpl extends ServiceImpl<TJfChargingItemTotalInfoMapper, TJfChargingItemTotalInfo> implements TJfChargingItemTotalInfoService {

}
