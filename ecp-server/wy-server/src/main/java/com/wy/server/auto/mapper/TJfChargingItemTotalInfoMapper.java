package com.wy.server.auto.mapper;

import com.wy.server.auto.entity.TJfChargingItemTotalInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 单个计费项当月的计费，审核，抵扣，托收，情况信息，单个计费项单月的一个汇总情况 Mapper 接口
 * </p>
 *
 * @author qhc
 * @since 2020-09-15
 */
@Mapper
public interface TJfChargingItemTotalInfoMapper extends BaseMapper<TJfChargingItemTotalInfo> {

}
