package com.windsoft.lt.grade.web.admin.service.impl;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.dto.PageInfo;
import com.windsoft.lt.grade.commons.validator.BeanValidator;
import com.windsoft.lt.grade.domain.Admin;
import com.windsoft.lt.grade.domain.User;
import com.windsoft.lt.grade.web.admin.dao.UserDao;
import com.windsoft.lt.grade.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author Ricost
 * @Date 2019/12/8 16:27
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public PageInfo<User> page(int start, int length, int draw, User user) {
        Map<String, Object> params = new HashMap<>();
        params.put("start",start);
        params.put("length",length);
        params.put("pageParams",user);

        int count = count(user);
        PageInfo<User> pageInfo = new PageInfo<>();
        pageInfo.setDraw(draw);
        pageInfo.setRecordsTotal(count);
        pageInfo.setRecordsFiltered(count);
        pageInfo.setData(userDao.page(params));

        return pageInfo;
    }


    @Override
    public int count(User user) {
        return userDao.count(user);
    }

    @Override
    public BaseResult save(User user) {
        String validator = BeanValidator.validator(user);
        //验证失败，返回提示信息
        if (validator != null){
            return BaseResult.fail(validator);
        }
        //验证成功
        else{
            user.setUpdated(new Date());
            if (user.getUid() == null){
                user.setCreated(new Date());
                user.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
                userDao.insert(user);
            }
            //更新用户信息
            else{
                userDao.update(user);
            }
        }
        return BaseResult.success("信息修改成功");
    }
}