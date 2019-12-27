package com.icetai.portal.master.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ReplaceMaster extends UMT{
    private String mid;

    private String uid;

    private String tradeId;

    private String majorId;

    private Date applyAt;

    private Date approvedAt;

    private String approvedBy;

    private Integer kindOfApplying;

    private Integer isSigned;

    private String deptId;

    private Date signedAt;

    private String contractId;

    private Integer fans;

    private Integer isHotTip;

    private Date hotEndAt;

    private Integer status;

    private Date createdAt;

    private Date updatedAt;

    private String createdBy;

    private String updatedBy;

    private Integer student;

    private Integer courseNums;

    private Integer articleNums;

}