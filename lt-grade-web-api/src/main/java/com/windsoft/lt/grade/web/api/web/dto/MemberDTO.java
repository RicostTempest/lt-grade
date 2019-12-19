package com.windsoft.lt.grade.web.api.web.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ClassName MemberDTO
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 13:30
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class MemberDTO {
    private String nickname;
    private Long stuId;
    private int juridisdiction;
}