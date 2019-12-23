package com.windsoft.lt.grade.web.ui.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ClassName Assignment
 * @Description
 * @Author Ricost
 * @Date 2019/12/22 13:37
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Assignment {
    private Long assId ;
    private String name;
    private String content;
    private int type;
    private Date created;
    private Date deadline;
    private Long orgId;
}