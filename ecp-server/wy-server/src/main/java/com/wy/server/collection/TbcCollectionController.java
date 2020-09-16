package com.wy.server.collection;

import com.wy.server.auto.entity.TcBuilding;
import com.wy.server.auto.service.TcBuildingService;
import com.wy.server.utils.SpringRedisTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("tuoshou")
    public TcBuilding tuoshou(){
        TBcCollectionTotal tBcCollectionTotal = new TBcCollectionTotal();
        tBcCollectionTotal.setBatchNo("nishishabi");
        springRedisTools.addData("nishishabi",tBcCollectionTotal.getBatchNo());

        String ss = springRedisTools.getByKey("nishishabi").toString();
        System.out.println(ss);
        TcBuilding tcBuilding = tcBuildingService.getTcBuildingById("00000926-0bf5-4a9a-a521-75a850f11a53");
        tcBuildingService.listPageTcBuilding();
        return tcBuilding;
    }



}
