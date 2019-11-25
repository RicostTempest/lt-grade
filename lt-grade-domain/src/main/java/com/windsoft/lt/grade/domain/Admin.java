package com.windsoft.lt.grade.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.windsoft.lt.grade.persistence.BaseEntity;
import com.windsoft.lt.grade.utils.RegexpUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

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
    private String email;
    @JsonIgnore
    private String password;
    private boolean status;
}
