package com.wy.server.auto.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ecp.common.entity.TcBuilding;
import com.wy.server.auto.mapper.TcBuildingMapper;
import com.wy.server.auto.service.TcBuildingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Service
public class TcBuildingServiceImpl extends ServiceImpl<TcBuildingMapper, TcBuilding> implements TcBuildingService {

    @Autowired
    private TcBuildingMapper tcBuildingMapper;
    private static Logger logger = LogManager.getLogger();

    @Override
    public TcBuilding getTcBuildingByid(String buildingId) {
        return getById("00000926-0bf5-4a9a-a521-75a850f11a53");
    }

    @Override
    public List<TcBuilding> listPageTcBuilding(Page page) {
        //这个不用配置，mybatisplus自带的
        QueryWrapper<TcBuilding> queryWrapper = new QueryWrapper<>();
        //配置了paginationInterceptor
        Page<TcBuilding> result = tcBuildingMapper.listPageTcBuilding(page,"Yes");
        logger.error(result);
        return null;
    }
}
