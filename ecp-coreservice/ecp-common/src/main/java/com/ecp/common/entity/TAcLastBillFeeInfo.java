package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 存放各个资产欠费总金额信息
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Data
@TableName("t_ac_last_bill_fee_info")
public class TAcLastBillFeeInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String houseCodeNew;

    /**
     * 上月欠费总金额=计费结果表中上月本期应付
     */
    private BigDecimal lastBillFee;

    private String accountId;

    private Integer projectId;

    private String projectName;

    private String createId;

    private LocalDateTime createTime;

    private String modifyId;

    private LocalDateTime modifyTime;

    private Boolean accountType;

    private String signature;

}
