package com.wy.server.auto.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author qhc
 * @since 2020-09-15
 */
@Data
@TableName("tc_building")
public class TcBuilding extends Model<TcBuilding> {

    private static final long serialVersionUID=1L;

    private String id;

    private String buildingCode;

    private String pid;

    /**
     * 节点名称
     */
    private String buildingName;

    /**
     * 节点全名称
     */
    private String buildingFullName;

    private String projectId;

    /**
     * 节点类型
     */
    private String buildingType;

    private String isChargeObj;

    /**
     * 开门密码
     */
    private String password;

    /**
     * 建筑总面积
     */
    private BigDecimal buildingArea;

    /**
     * 套内面积
     */
    private BigDecimal usableArea;

    /**
     * 公摊面积
     */
    private BigDecimal shareArea;

    /**
     * 竣工日期
     */
    private LocalDate finishDate;

    /**
     * 用地总面积
     */
    private BigDecimal floorArea;

    private String houseCode;

    private String houseCodeNew;

    /**
     * 资产名称，如商铺名称等
     */
    private String propertyName;

    /**
     * 资产地址
     */
    private String propertyAddr;

    /**
     * 项目地址
     */
    private String projectAddress;

    /**
     * 小区名称
     */
    private String streetAddress;

    /**
     * 公司编码
     */
    private String companyId;

    /**
     * 如何标识：已入伙，未入伙
     */
    private String joinFlag;

    /**
     * 入伙日期
     */
    private LocalDate joinDate;

    /**
     * 物业费单价
     */
    private BigDecimal unitWyPrice;

    /**
     * 本体基金单价
     */
    private BigDecimal unitBtPrice;

    /**
     * 产权类型：如红本，蓝本，小产权
     */
    private String propertyRightType;

    /**
     * 产权属性
     */
    private String propertyAttributes;

    /**
     * 是否拥有产权标识:Yes,No
     */
    private String propertyRightFlag;

    /**
     * 房产证号
     */
    private String buildingCertificate;

    /**
     * 资产属性，类型
     */
    private String assetAttributes;

    /**
     * 销售状态
     */
    private String marketState;

    /**
     * 建筑高度
     */
    private String buildingHeight;

    /**
     * 折扣，未入住，按百分百
     */
    private String discounts;

    /**
     * 车位类型
     */
    private String parkingSpaceType;

    /**
     * 是否是标准建筑结构
     */
    private String isStandardBuilding;

    /**
     * 使用方式
     */
    private String assetUsage;

    /**
     * 位置属性
     */
    private String placeAttribute;

    /**
     * 账单地址
     */
    private String billAddress;

    /**
     * 关联车位
     */
    private String associatedParkingSpaces;

    private String isFixedParkingSpaces;

    /**
     * 创建用户id
     */
    private String createrId;

    /**
     * 创建用户名称
     */
    private String createrName;

    /**
     * 最后更新用户id
     */
    private String modifyId;

    /**
     * 最后更新用户名称
     */
    private String modifyName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    private LocalDateTime modifyTime;

    private Boolean isDelete;

    private String verifyElectStatus;

    private String verifyStatus;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
