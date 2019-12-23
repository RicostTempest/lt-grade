package com.windsoft.lt.grade.web.ui.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ClassName Resource
 * @Description
 * @Author Ricost
 * @Date 2019/12/22 10:23
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Resource {
    private Long resId;
    private String resName;
    private int resType;
    private String url;
    private Date created;
}