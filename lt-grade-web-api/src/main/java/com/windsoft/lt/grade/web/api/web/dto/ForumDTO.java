package com.windsoft.lt.grade.web.api.web.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ClassName ForumDTO
 * @Description
 * @Author Ricost
 * @Date 2019/12/23 10:05
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class ForumDTO {
    private Long fomId;
    private Long uid;
    private Long orgId  ;
    private String document ;
    private Date created ;
    private Date updated ;
    private Long reply ;
}