package com.windsoft.lt.grade.web.api.service.impl;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.User;
import com.windsoft.lt.grade.web.api.dao.UserDao;
import com.windsoft.lt.grade.web.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author Ricost
 * @Date 2019/12/2 11:34
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public BaseResult login(String email, String password) {
        User user = userDao.getByEmail(email);

        if(user != null ){
            //MD5加密
            String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());

            //判断密文密码时否正确
            if(md5Password.equals(user.getPassword())){
                return BaseResult.success("登录成功",user);
            }
            else {
                return BaseResult.fail("密码错误");
            }

        }
        return BaseResult.fail("邮箱错误");
    }
}