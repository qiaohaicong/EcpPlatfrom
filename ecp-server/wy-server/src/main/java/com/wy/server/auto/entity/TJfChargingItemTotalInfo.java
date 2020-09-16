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
 * 单个计费项当月的计费，审核，抵扣，托收，情况信息，单个计费项单月的一个汇总情况
 * </p>
 *
 * @author qhc
 * @since 2020-09-15
 */
@Data
@TableName("t_jf_charging_item_total_info")
public class TJfChargingItemTotalInfo extends Model<TJfChargingItemTotalInfo> {

    private static final long serialVersionUID=1L;

    private String id;

    /**
     * 计费项id  关联计费项信息表
     */
    private String chargingItemId;

    private String chargingItemName;

    private Boolean chargingType;

    /**
     * 开始计费时间是对项目可开始计费时间的描述，实际计费时间不一定是这一天
     */
    private LocalDateTime startChargingTime;

    private LocalDateTime endChargingTime;

    private Boolean chargingStatus;

    private Boolean auditStatus;

    private Boolean deductStatus;

    /**
     * 计费时间
     */
    private LocalDateTime chargingTime;

    /**
     * 审核时间
     */
    private LocalDateTime auditTime;

    /**
     * 抵扣时间
     */
    private LocalDateTime deductTime;

    /**
     * 本期计费总额
     */
    private BigDecimal currentChargingTotal;

    /**
     * 本期抵扣总额
     */
    private BigDecimal currentDeductTotal;

    /**
     * 上期欠费总额
     */
    private BigDecimal lastArrearsTotal;

    /**
     * 计费次数
     */
    private Integer chargingTimes;

    /**
     * 上期计费id
     */
    private String lastChargingId;

    /**
     * 本期总计费数
     */
    private Integer chargingNum;

    private Integer projectId;

    private String projectName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createId;

    private String chargingOperaId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
