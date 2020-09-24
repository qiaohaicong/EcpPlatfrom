package com.wy.server.auto.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ecp.common.entity.TcBuilding;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qhc
 * @since 2020-09-24
 */
@Component
//@Mapper
public interface TcBuildingMapper extends BaseMapper<TcBuilding> {

    Page<TcBuilding> listPageTcBuilding(Page<TcBuilding> page, @Param("isCharge") String isCharge);

}
