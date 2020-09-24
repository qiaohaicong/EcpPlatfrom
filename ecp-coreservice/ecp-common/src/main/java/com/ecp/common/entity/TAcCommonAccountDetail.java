package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 记录每个资产通用账户的金额变动流水信息
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Data
@TableName("t_ac_common_account_detail")
public class TAcCommonAccountDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String accountId;

    private String houseCodeNew;

    /**
     * 变动前的账户余额
     */
    private BigDecimal beforeAmount;

    /**
     * 账户变动后的月
     */
    private BigDecimal afterAmount;

    /**
     * 本次发生变动的金额
     */
    private BigDecimal changeAmount;

    private Integer businessType;

    private Integer dikouType;

    /**
     * 关联计费的明细id
     */
    private String billDetailId;

    private String description;

    private Integer projectId;

    private String projectName;

    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createId;

    private String operaId;

}
