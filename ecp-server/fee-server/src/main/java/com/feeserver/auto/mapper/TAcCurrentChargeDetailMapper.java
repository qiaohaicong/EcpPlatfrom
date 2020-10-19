package com.feeserver.auto.mapper;

import com.ecp.common.entity.TAcCurrentChargeDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 各个资产每月的计费明细记录，也作为账单获取数据的依据 Mapper 接口
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Mapper
public interface TAcCurrentChargeDetailMapper extends BaseMapper<TAcCurrentChargeDetail> {

}
