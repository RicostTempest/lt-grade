package com.windsoft.lt.grade.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.windsoft.lt.grade.commons.persistence.BaseEntity;


import com.windsoft.lt.grade.commons.utils.RegexpUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Pattern;

/**
 * @ClassName Admin
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/24 14:06
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class Admin extends BaseEntity {
    @Pattern(regexp = RegexpUtils.EMAIL, message = "邮箱格式不正确")
    private String email;
    @JsonIgnore
    private String password;
    private boolean activity;
}
