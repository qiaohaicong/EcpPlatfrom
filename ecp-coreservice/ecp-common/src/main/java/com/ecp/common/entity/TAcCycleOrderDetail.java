package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Data
@TableName("t_ac_cycle_order_detail")
public class TAcCycleOrderDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String detailId;

    private String orderId;

    private Boolean businessType;

    private Boolean depositType;

    private Boolean accountType;

    private BigDecimal detailAmount;

    private String houseCodeNew;

    private BigDecimal lateAmount;

    private LocalDateTime createTime;

}
