package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 存放各个资产滞纳金账户的信息汇总表
 * </p>
 *
 * @author qhc
 * @since 2020-09-21
 */
@Data
@TableName("t_ac_delay_account")
public class TAcDelayAccount implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    /**
     * 单个资产滞纳金总额
     */
    private BigDecimal amount;

    private String accountId;

    private Integer projectId;

    private String projectName;

    private String createId;

    private LocalDateTime createTime;

    private String modifyId;

    private LocalDateTime modifyTime;

    private Integer accountType;

    private String houseCodeNew;

}
