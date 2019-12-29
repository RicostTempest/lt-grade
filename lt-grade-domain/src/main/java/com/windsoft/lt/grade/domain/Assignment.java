package com.windsoft.lt.grade.domain;

import com.windsoft.lt.grade.commons.persistence.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Assignment
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 14:33
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Assignment extends BaseEntity implements Serializable {
    private Long assId ;
    private String name;
    private String content;
    private int type;
    private Date created;
    private Date deadline;
    private Organization organization;
}