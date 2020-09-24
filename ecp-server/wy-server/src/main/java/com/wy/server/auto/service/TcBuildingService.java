package com.wy.server.auto.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ecp.common.entity.TcBuilding;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
public interface TcBuildingService extends IService<TcBuilding> {

    TcBuilding getTcBuildingByid(String buildingId);

    List<TcBuilding> listPageTcBuilding(Page page);

}
