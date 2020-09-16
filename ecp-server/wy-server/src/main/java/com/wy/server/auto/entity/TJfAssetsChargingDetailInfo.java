package com.wy.server.auto.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("t_jf_assets_charging_detail_info")
public class TJfAssetsChargingDetailInfo extends Model<TJfAssetsChargingDetailInfo> {

    private static final long serialVersionUID=1L;

    private String id;

    private String chargingTotalId;

    private Boolean chargingType;

    private String houseCode;

    private String buildingName;

    /**
     * 本期计费金额
     */
    private BigDecimal currentChargingFee;

    /**
     * 上期计费id，关联上次的计费详情id
     */
    private String lastChargingId;

    private Boolean chargingStatus;

    /**
     * 计费详情（json串格式存储计费的详细明细，单价，规则，面积，各阶梯的金额等等）
     */
    private String chargingDetail;

    private Boolean auditStatus;

    private Boolean deductibleStatus;

    /**
     * 计费时间
     */
    private LocalDateTime chargingTime;

    private Boolean isCreateBill;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createId;

    /**
     * 计费项为物业，本体时 此处填房屋面积，为水电是为审核后的读数
     */
    private BigDecimal defaultReading;

    /**
     * 对应水电等峰谷平读数
     */
    private BigDecimal extReading;

    private BigDecimal extReading1;

    private BigDecimal extReading2;

    /**
     * 存放水电表的读数，上期读数，倍率字段
     */
    private String readingInfos;

    /**
     * 本期账单金额（包含本期计费，上期欠费，违约金等）
     */
    private BigDecimal currentBillFee;

    private LocalDateTime auditTime;

    private String auditUid;

    /**
     * 1 手动审核 0 自动审核
     */
    private Integer auditMode;

    /**
     * 折扣金额
     */
    private BigDecimal discountAmount;

    /**
     * 折扣后金额
     */
    private BigDecimal afterDiscountAmount;

    /**
     * 截止计费时间，上期还存在的欠费金额
     */
    private BigDecimal lastBillFee;

    /**
     * 截止计费时间，计费项类型的违约金欠费
     */
    private BigDecimal lateFee;

    /**
     * 分摊金额，分摊后会填入写账单用
     */
    private BigDecimal shareFee;

    /**
     * 截止计费时间上期已经付款总额
     */
    private BigDecimal lastPayed;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
