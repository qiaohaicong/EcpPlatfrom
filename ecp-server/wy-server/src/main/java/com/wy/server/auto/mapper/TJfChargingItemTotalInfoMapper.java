package com.wy.server.auto.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecp.common.entity.TJfChargingItemTotalInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 单个计费项当月的计费，审核，抵扣，托收，情况信息，单个计费项单月的一个汇总情况 Mapper 接口
 * </p>
 *
 * @author qhc
 * @since 2020-09-24
 */
@Component
//@Mapper
public interface TJfChargingItemTotalInfoMapper extends BaseMapper<TJfChargingItemTotalInfo> {

}
