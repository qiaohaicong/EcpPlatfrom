package com.feeserver.auto.mapper;

import com.ecp.common.entity.TAcBillDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 每月产生一条账单数据，包含账单里面所有的内容 Mapper 接口
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Mapper
public interface TAcBillDetailMapper extends BaseMapper<TAcBillDetail> {

}
