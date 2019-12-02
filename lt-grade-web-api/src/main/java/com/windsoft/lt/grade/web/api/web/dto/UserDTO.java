package com.windsoft.lt.grade.web.api.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.windsoft.lt.grade.commons.persistence.BaseEntity;
import com.windsoft.lt.grade.commons.utils.RegexpUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName UserDTO
 * @Description
 * @Author Ricost
 * @Date 2019/12/2 11:01
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class UserDTO implements Serializable {
    private Long uid;
    private String email;
    private String nickname;
    private Date created;
    private Date updated;
    private int juridisdiction;
    private Long stuId;
    private Long tecId;
}