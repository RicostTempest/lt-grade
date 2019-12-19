package com.windsoft.lt.grade.web.api.web.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class OrganizationDTO {
    private String orgName;
    private int orgType;
    private String intor;
    private Date created;
    private int juridisdiction;
    private String nickname;

}