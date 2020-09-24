package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 各个资产每月的计费明细记录，也作为账单获取数据的依据
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Data
@TableName("t_ac_current_charge_detail")
public class TAcCurrentChargeDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String houseCodeNew;

    private BigDecimal chargeAmount;

    private String accountId;

    /**
     * 计费项目也就是区分计费类型（1：物业管理费 2：本体基金  3：水费  4：电费  。。。后面有新的递增累加）
     */
    private Integer accountType;

    private LocalDateTime chargeTime;

    private LocalDateTime auditTime;

    private String lastChargeId;

    /**
     * 尽可能详细的存放账单那边需要的数据信息
     */
    private String chargeDetail;

    /**
     * 通用账户发生的抵扣金额
     */
    private BigDecimal commonDikou;

    /**
     * 专项账户发生的抵扣金额
     */
    private BigDecimal specialDikou;

    private Integer projectId;

    private String projectName;

    private String createId;

    private LocalDateTime createTime;

    /**
     * 已付款金额，存放本次账单的已付款金额，如果全部结清，则修改是否已付款状态为2
     */
    private BigDecimal payedAmount;

    /**
     * 本次支付金额字段
     */
    private BigDecimal currentPayment;

    private BigDecimal assignAmount;

    private LocalDateTime updateTime;

    /**
     * 本期计费应缴=本期计费+分摊
     */
    private BigDecimal payableAmount;

    /**
     * 本期欠费
     */
    private BigDecimal currenctArreas;

    private Integer businessType;

    private String operaId;

    /**
     * 新增了记录这条数据生成节点的账户总欠费,用于追溯数据用
     */
    private BigDecimal totalHistoryArrears;

    private String virYm;
}
