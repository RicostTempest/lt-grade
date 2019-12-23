package com.windsoft.lt.grade.web.api.web.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ClassName AssignmentDTO
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 19:05
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class AssignmentDTO {
    private Long assId ;
    private String name;
    private String content;
    private int type;
    private Date created;
    private Date deadline;
    private Long orgId;
}