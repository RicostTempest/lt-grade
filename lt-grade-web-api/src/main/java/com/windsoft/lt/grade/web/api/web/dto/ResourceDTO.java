package com.windsoft.lt.grade.web.api.web.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName ResourceDTO
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 23:36
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class ResourceDTO implements Serializable {
    private Long resId;
    private String resName;
    private int resType;
    private String url;
    private Date created;
}