package com.windsoft.lt.grade.web.ui.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description
 * @Author Ricost
 * @Date 2019/12/2 11:01
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class User implements Serializable {
    private Long uid;
    private String email;
    private String password;
    private String nickname;
    private Date created;
    private Date updated;
    private int juridisdiction;
    private Long stuId;
    private Long tecId;
}