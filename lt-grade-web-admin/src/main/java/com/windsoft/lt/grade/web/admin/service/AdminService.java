package com.windsoft.lt.grade.web.admin.service;

import com.windsoft.lt.grade.domain.Admin;
import com.windsoft.lt.grade.dto.PageInfo;

import java.util.HashMap;
import java.util.Map;

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
}