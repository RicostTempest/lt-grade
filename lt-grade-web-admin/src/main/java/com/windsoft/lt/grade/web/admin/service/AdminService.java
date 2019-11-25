package com.windsoft.lt.grade.web.admin.service;

import com.windsoft.lt.grade.domain.Admin;

/**
 * @InterfaceName AdminService
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/24 14:23
 * @Version V1.0
 **/

public interface AdminService {
    Admin login(String email, String password);
}