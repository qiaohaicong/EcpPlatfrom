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
@TableName("t_ac_order")
public class TAcOrder implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String orderNo;

    private BigDecimal amount;

    private String payer;

    private String payerMobile;

    private Boolean orderState;

    private Boolean payState;

    private Boolean orderType;

    private LocalDateTime updateTime;

    private String operaId;

    private String signature;

    private LocalDateTime paymentTime;

    private String houseCodeNew;

    private Integer paymentChannel;

    private Boolean isRcorded;

    /**
     * 1 渠道交易订单号
     */
    private String payChannelTradeNo;

    /**
     * 交割单号
     */
    private Boolean isDelivery;

    /**
     * 交割单号
     */
    private String deliveryNo;
}
