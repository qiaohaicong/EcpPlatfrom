package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 资产账户，一处资产信息对应一个账户（总账户）
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Data
@TableName("t_ac_account")
public class TAcAccount implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String houseCodeNew;

    /**
     * 通用账户金额
     */
    private BigDecimal commonDepositAmount;

    /**
     * 专项抵扣金额（例：物业100 本体20  水费200 电费  0）
     */
    private BigDecimal specialDepositAmount;

    /**
     * 此资产所产生的滞纳金金额
     */
    private BigDecimal lateFeeAmount;

    /**
     * 当月计费总金额
     */
    private BigDecimal currentChargingAmount;

    /**
     * 上月欠费总金额
     */
    private BigDecimal lastArrearsAmount;

    /**
     * 当月账单总金额
     */
    private BigDecimal currentBillAmount;

    private Integer projectId;

    private String projectName;

    private LocalDateTime createTime;

    /**
     * 创建人，如果是系统则使用system，如果是具体员工，关联t_sys_user表的user_id
     */
    private String createId;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 修改人，如果是系统则使用system，如果是具体员工，关联t_sys_user表的user_id
     */
    private String modifyId;

    /**
     * 对涉及到的金额+时间字段进行签名，任何写入更新之前都需要校验此字段，校验成功后才能更新/写入
     */
    private String signature;

    private String chargingMonth;

}
