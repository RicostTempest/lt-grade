package com.windsoft.lt.grade.domain;

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
public class Assignment  implements Serializable {
    private Long assId ;
    private String name;
    private String comtent;
    private int type;
    private Date created;
    private Date deadline;
    private Organization organization;
}