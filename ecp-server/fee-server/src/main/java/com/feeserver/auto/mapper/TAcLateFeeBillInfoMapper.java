package com.feeserver.auto.mapper;

import com.ecp.common.entity.TAcLateFeeBillInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 存放各个账户需要开始计违约金的信息表 Mapper 接口
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Mapper
public interface TAcLateFeeBillInfoMapper extends BaseMapper<TAcLateFeeBillInfo> {

}
