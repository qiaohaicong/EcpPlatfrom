package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 前台每操作一笔资金相关的业务,记录一条流水明细
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Data
@TableName("t_ac_business_opera_detail")
public class TAcBusinessOperaDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    /**
     * 通过当前登录用户来获取
     */
    private String operationId;

    private LocalDateTime operationTime;

    /**
     * 1缴费，.2预存, 3退费，4减免
     */
    private Integer businessType;

    private BigDecimal amount;

    private String projectId;

    private String projectName;

    private String remark;

    private String signature;

    /**
     * 1物业前台工作人员，2业主业主本人
     */
    private Integer personType;

    /**
     * 1 pc(前台现金缴费)，2 pos(前台pos缴费)，3小程序缴费(业主在小程序内进行缴费)
     */
    private Integer clientType;


}
