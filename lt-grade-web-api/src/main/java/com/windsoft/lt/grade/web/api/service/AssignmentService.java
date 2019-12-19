package com.windsoft.lt.grade.web.api.service;

import com.windsoft.lt.grade.commons.dto.BaseResult;

/**
 * @InterfaceName AssignmentService
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 14:50
 * @Version V1.0
 **/

public interface AssignmentService {
    BaseResult getAll(Long id);
}