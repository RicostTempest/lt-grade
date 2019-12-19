package com.windsoft.lt.grade.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @ClassName LinkOrgUser
 * @Description
 * @Author Ricost
 * @Date 2019/12/13 8:54
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class LinkOrgUser implements Serializable {
    private Organization organization;
    private User user;
    private int controller;
}