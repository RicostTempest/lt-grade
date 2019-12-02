package com.windsoft.lt.grade.web.api.service;

import com.windsoft.lt.grade.commons.dto.BaseResult;

/**
 * @InterfaceName UserService
 * @Description
 * @Author Ricost
 * @Date 2019/12/2 11:33
 * @Version V1.0
 **/

public interface UserService {
    BaseResult login(String email, String password);
}