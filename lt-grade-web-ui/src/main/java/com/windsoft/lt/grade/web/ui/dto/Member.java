package com.windsoft.lt.grade.web.ui.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ClassName Member
 * @Description
 * @Author Ricost
 * @Date 2019/12/22 13:22
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Member {
    private String nickname;
    private Long stuId;
    private int juridisdiction;
}