package com.wy.server.collection;

import com.ecp.common.entity.TcBuilding;
import com.wy.server.auto.service.TcBuildingService;
import com.wy.server.utils.SpringRedisTools;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Auther: DELL
 * @Date: 2020/8/28 14:48
 * @Description:
 */
@RestController
@RequestMapping("collection")
public class TbcCollectionController {

    @Autowired
    private SpringRedisTools springRedisTools;
    @Autowired
    private TcBuildingService tcBuildingService;
    private static Logger logger = LogManager.getLogger();

    @PostMapping("tuoshou")
    public TcBuilding tuoshou(){
        TcBuilding tcBuilding = new TcBuilding();
        tcBuilding.setHouseCode("nishishabi");
        tcBuilding.setAssetUsage("大傻逼");
        tcBuilding.setBuildingArea(new BigDecimal("80.45"));
        springRedisTools.addData("nishishabi",tcBuilding);

        TcBuilding ss = (TcBuilding)springRedisTools.getByKey("nishishabi");
        logger.info("sssssss:::**************{}",ss.getBuildingArea());
//        TcBuilding tcBuilding = tcBuildingService.getTcBuildingById("00000926-0bf5-4a9a-a521-75a850f11a53");
//        tcBuildingService.listPageTcBuilding();
        return null;
    }



}
