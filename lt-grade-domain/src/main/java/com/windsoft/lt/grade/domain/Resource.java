package com.windsoft.lt.grade.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ClassName Resource
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 20:37
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Resource {
    private Long resId;
    private String url;
    private float size;
    private Date created;
}