package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 存放各个账户需要开始计违约金的信息表
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Data
@TableName("t_ac_late_fee_bill_info")
public class TAcLateFeeBillInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private Integer projectId;

    private String projectName;

    private String description;

    private Boolean isSingleinterest;

    private BigDecimal rate;

    private Integer overdueDays;

    private Boolean isUsed;

    private Boolean accountType;

    private LocalDateTime createTime;

    private String createBy;

}
