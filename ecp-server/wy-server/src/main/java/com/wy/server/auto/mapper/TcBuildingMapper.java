package com.wy.server.auto.mapper;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wy.server.auto.entity.TcBuilding;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qhc
 * @since 2020-09-15
 */
@Mapper
public interface TcBuildingMapper extends BaseMapper<TcBuilding> {

    Page<TcBuilding> getBuildingList(Page<TcBuilding> page, @Param("isCharge") String isCharge);

}
