package com.windsoft.lt.grade.web.api.service;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.User;

/**
 * @InterfaceName UserService
 * @Description
 * @Author Ricost
 * @Date 2019/12/2 11:33
 * @Version V1.0
 **/

public interface UserService {
    BaseResult login(String email, String password);
    BaseResult save(User user);
}