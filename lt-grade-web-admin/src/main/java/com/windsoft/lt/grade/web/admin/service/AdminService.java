package com.windsoft.lt.grade.web.admin.service;

import com.windsoft.lt.grade.domain.Admin;
import com.windsoft.lt.grade.commons.dto.PageInfo;
import com.windsoft.lt.grade.commons.dto.BaseResult;

/**
 * @InterfaceName AdminService
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/24 14:23
 * @Version V1.0
 **/

public interface AdminService {
    Admin login(String email, String password);

    Admin getById(Long id);

    public PageInfo<Admin> page(int start, int length, int draw, Admin admin);

    int count(Admin admin);

    BaseResult save(Admin admin);
}