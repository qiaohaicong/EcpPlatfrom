package com.feeserver.auto.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecp.common.entity.TAcBusinessOperaDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 前台每操作一笔资金相关的业务,记录一条流水明细 Mapper 接口
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Mapper
public interface TAcBusinessOperaDetailMapper extends BaseMapper<TAcBusinessOperaDetail> {

}
