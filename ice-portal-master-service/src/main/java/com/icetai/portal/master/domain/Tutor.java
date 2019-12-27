package com.icetai.portal.master.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Tutor {
    private String uid;

    private String mid;

    private String username;

    private String password;

    private String nickname;

    private String desc;

    private String email;

    private String mobile;

    private String wechat;

    private String qq;

    private Integer status;

    private Date lastLoginTime;

    private Integer sex;

    private String avatar;

    private String rid;

    private Integer cardType;

    private String realName;

    private String idCard;

    private Integer isCertified;

    private String address;

    private Integer age;

    private String birthday;

    private String bankCard;

    private String chat_code;

    private String location;

    private Integer live_code;

    private Date createdAt;

    private Date updatedAt;

    private String createdBy;

    private String updatedBy;


}