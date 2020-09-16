package com.wy.server.auto.service;

import com.wy.server.auto.entity.TcBuilding;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qhc
 * @since 2020-09-15
 */
public interface TcBuildingService extends IService<TcBuilding> {

    TcBuilding getTcBuildingById(String buildingId);

    List<TcBuilding> listPageTcBuilding();

}
