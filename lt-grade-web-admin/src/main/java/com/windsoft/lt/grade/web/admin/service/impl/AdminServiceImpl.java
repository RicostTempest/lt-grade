package com.windsoft.lt.grade.web.admin.service.impl;

import com.windsoft.lt.grade.domain.Admin;
import com.windsoft.lt.grade.web.admin.dao.AdminDao;
import com.windsoft.lt.grade.web.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @ClassName AdminServiceImpl
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/24 14:24
 * @Version V1.0
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin login(String email, String password) {
        Admin admin = adminDao.getByEmail(email);

        if(admin != null){
            //MD5加密
            String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());

            //判断密文密码时否正确
            if(md5Password.equals(admin.getPassword())){
                return admin;
            }
        }
        return null;
    }
}
