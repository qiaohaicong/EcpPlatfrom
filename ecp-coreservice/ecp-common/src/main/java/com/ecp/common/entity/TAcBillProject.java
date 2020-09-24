package com.ecp.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
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
@TableName("t_ac_bill_project")
public class TAcBillProject implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String projectId;

    private String projectName;

    private Boolean billStatus;

    /**
     * yyyy-mm
     */
    private String billDate;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String updateBy;

    private Integer pages;

    private String fileId;

    private Boolean isGenerating;

    /**
     * 是否发送过短信
     */
    private Boolean isSent;

    /**
     * 发送的短信条数
     */
    private Integer smsCount;

}
