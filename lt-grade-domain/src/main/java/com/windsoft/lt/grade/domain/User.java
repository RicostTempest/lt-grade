package com.windsoft.lt.grade.domain;

import com.windsoft.lt.grade.commons.persistence.BaseEntity;
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
public class User extends BaseEntity {
    private Long uid;
    private String email;
    private String password;
    private String nickname;
    private int juridisdiction;
    private Long stuId;
    private Long tecId;
}