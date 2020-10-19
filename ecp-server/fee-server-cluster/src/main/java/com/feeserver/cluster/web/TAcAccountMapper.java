package com.feeserver.cluster.web;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecp.common.entity.TAcAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 资产账户，一处资产信息对应一个账户（总账户） Mapper 接口
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Mapper
public interface TAcAccountMapper extends BaseMapper<TAcAccount> {

}
