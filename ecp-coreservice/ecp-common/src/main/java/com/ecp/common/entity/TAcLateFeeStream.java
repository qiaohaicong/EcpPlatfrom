package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 记录各个资产产生违约金的流水详情信息
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Data
@TableName("t_ac_late_fee_stream")
public class TAcLateFeeStream implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String delayAccountId;

    private String houseCodeNew;

    /**
     * 账户变动前金额
     */
    private BigDecimal beforeAmount;

    /**
     * 账户变动后金额
     */
    private BigDecimal afterAmount;

    /**
     * 变动金额
     */
    private BigDecimal changeAmount;

    private Integer businessType;

    private Integer projectId;

    private String projectName;

    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createId;

    private String description;

    /**
     * 前台做滞纳金减免的时候写入
     */
    private String operaId;

    private BigDecimal principalAccount;

    private BigDecimal rate;

    private Boolean isSingleinterest;

    private Integer overdueDays;

}
