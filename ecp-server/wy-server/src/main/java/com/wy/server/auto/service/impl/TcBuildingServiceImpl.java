package com.wy.server.auto.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wy.server.auto.entity.TcBuilding;
import com.wy.server.auto.mapper.TcBuildingMapper;
import com.wy.server.auto.service.TcBuildingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import javafx.scene.control.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qhc
 * @since 2020-09-15
 */
@Service
public class TcBuildingServiceImpl extends ServiceImpl<TcBuildingMapper, TcBuilding> implements TcBuildingService {

    @Autowired
    private TcBuildingMapper tcBuildingMapper;

    @Override
    public TcBuilding getTcBuildingById(String buildingId) {
        return getById(buildingId);
    }

    @Override
    public List<TcBuilding> listPageTcBuilding() {
        QueryWrapper<TcBuilding> wrapper = new QueryWrapper<>();
        Page<TcBuilding> page = new Page(2,10);
//        Pagination
//        List<TcBuilding> result = tcBuildingMapper.selectList(wrapper);
//        IPage<TcBuilding> result = tcBuildingMapper.selectPage(page,wrapper);
         Page<TcBuilding> result = tcBuildingMapper.getBuildingList(page,"Yes");
         System.out.println(result+"*******************************");
        return null;
    }
}
