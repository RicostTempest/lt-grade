package com.windsoft.lt.grade.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ClassName LinkResOrg
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 20:44
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class LinkResOrg {
    private Resource resource;
    private Organization organization;
    private String resName;
    private int resType;
}