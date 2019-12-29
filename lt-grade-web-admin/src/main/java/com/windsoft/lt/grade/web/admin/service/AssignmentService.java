package com.windsoft.lt.grade.web.admin.service;

import com.windsoft.lt.grade.commons.dto.PageInfo;
import com.windsoft.lt.grade.domain.Assignment;

/**
 * @InterfaceName AssignmentService
 * @Description
 * @Author Ricost
 * @Date 2019/12/29 9:26
 * @Version V1.0
 **/

public interface AssignmentService {
    PageInfo<Assignment> page(int start, int length, int draw, Assignment assignment);
    int count(Assignment assignment);
    Assignment getById(Long id);
}