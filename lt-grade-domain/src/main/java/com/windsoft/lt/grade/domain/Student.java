package com.windsoft.lt.grade.domain;

import com.windsoft.lt.grade.commons.persistence.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ClassName Student
 * @Description
 * @Author Ricost
 * @Date 2019/12/9 10:12
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class Student {
    private Long stuId;
    private Long garId;
    private String stuName;
    private String stuSex;
    private Date enrollment;
    private int lengthScholling;
    private String phone;
    private String birthplace;
    private String politicsStatus;
    private String icNumber;
}