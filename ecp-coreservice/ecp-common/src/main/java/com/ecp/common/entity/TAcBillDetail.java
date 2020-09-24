package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 每月产生一条账单数据，包含账单里面所有的内容
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Data
@TableName("t_ac_bill_detail")
public class TAcBillDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private LocalDateTime createTime;

    private String billMonth;

    private Boolean billState;

    private String billDetail;

    private String houseCodeNew;

    private String accountId;

    private BigDecimal billAmount;

    private String billPayer;

    private String billAddress;

    private LocalDateTime billInvalid;

    private Integer projectId;

    private String signature;

    private Boolean payState;

    private String fullName;
}
