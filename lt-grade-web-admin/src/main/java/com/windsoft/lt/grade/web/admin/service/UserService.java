package com.windsoft.lt.grade.web.admin.service;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.dto.PageInfo;
import com.windsoft.lt.grade.domain.User;

/**
 * @InterfaceName UserService
 * @Description
 * @Author Ricost
 * @Date 2019/12/8 16:27
 * @Version V1.0
 **/

public interface UserService {
    User getById(Long id);
    PageInfo<User> page(int start, int length, int draw, User user);
    int count(User user);
    BaseResult save(User user);
}