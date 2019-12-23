package com.windsoft.lt.grade.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ClassName Forum
 * @Description
 * @Author Ricost
 * @Date 2019/12/23 9:07
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Forum {
    private Long fomId  ;
    private User user  ;
    private Organization organization  ;
    private String document ;
    private Date created ;
    private Date updated ;
    private Long reply ;
}