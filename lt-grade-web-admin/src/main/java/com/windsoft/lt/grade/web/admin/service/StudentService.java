package com.windsoft.lt.grade.web.admin.service;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.dto.PageInfo;
import com.windsoft.lt.grade.domain.Student;
import com.windsoft.lt.grade.domain.User;

import java.util.List;

/**
 * @InterfaceName UserService
 * @Description
 * @Author Ricost
 * @Date 2019/12/8 16:27
 * @Version V1.0
 **/

public interface StudentService {
    List<Student> selectAll();
}