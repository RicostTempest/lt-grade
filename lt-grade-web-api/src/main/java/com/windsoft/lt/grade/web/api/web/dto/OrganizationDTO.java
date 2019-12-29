package com.windsoft.lt.grade.web.api.web.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName OrganizationDTO
 * @Description
 * @Author Ricost
 * @Date 2019/12/18 8:52
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class OrganizationDTO implements Serializable {
    private Long orgId;
    private String orgName;
    private int orgType;
    private String intro;
    private Date created;
    private int juridisdiction;
    private Long uid;
    private String nickname;

}