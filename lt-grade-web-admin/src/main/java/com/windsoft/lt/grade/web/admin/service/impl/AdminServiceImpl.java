package com.windsoft.lt.grade.web.admin.service.impl;

import com.windsoft.lt.grade.commons.persistence.BaseEntity;
import com.windsoft.lt.grade.domain.Admin;
import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.dto.PageInfo;
import com.windsoft.lt.grade.commons.validator.BeanValidator;
import com.windsoft.lt.grade.web.admin.dao.AdminDao;
import com.windsoft.lt.grade.web.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName AdminServiceImpl
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/24 14:24
 * @Version V1.0
 **/
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public BaseResult login(String email, String password) {
        Admin admin = adminDao.getByEmail(email);

        if(admin != null ){
            if(admin.isActivity()){
                //MD5加密
                String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());

                //判断密文密码时否正确
                if(md5Password.equals(admin.getPassword())){
                    return BaseResult.success("登录成功",admin);
                }
                else {
                    return BaseResult.fail("密码错误");
                }
            }
            else {
                return BaseResult.fail("用户已被禁用");
            }

        }
        return BaseResult.fail("邮箱错误");
    }

    @Override
    public Admin getById(Long id) {
        return adminDao.getById(id);
    }

    @Override
    public PageInfo<Admin> page(int start, int length, int draw, Admin admin, Admin user) {
        Map<String, Object> params = new HashMap<>();
        params.put("start",start);
        params.put("length",length);
        params.put("pageParams",admin);
        params.put("user",user);

        int count = count(admin);
        PageInfo<Admin> pageInfo = new PageInfo<>();
        pageInfo.setDraw(draw);
        pageInfo.setRecordsTotal(count);
        pageInfo.setRecordsFiltered(count);
        pageInfo.setData(adminDao.page(params));

        return pageInfo;
    }

    public int count(Admin admin) {
        return adminDao.count(admin);
    }

    @Override
    public BaseResult save(Admin admin) {
        String validator = BeanValidator.validator(admin);
        //验证失败，返回提示信息
        if (validator != null){
            return BaseResult.fail(validator);
        }
        //验证成功
        else{
            admin.setUpdated(new Date());
            if (admin.getId() == null){
                admin.setCreated(new Date());
                admin.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
                adminDao.insert(admin);
            }
            //更新用户信息
            else{
                adminDao.update(admin);
            }
        }
        return BaseResult.success("信息修改成功");
    }

    @Override
    public BaseResult orActivity(Admin admin) {

        BaseResult baseResult = BaseResult.fail();
        if (admin != null){
            admin.setActivity(!admin.isActivity());
            adminDao.update(admin);
            if(admin.isActivity()){
                baseResult = BaseResult.success("成功激活");
            }
            else {
                baseResult = BaseResult.success("成功禁用");
            }
        }

        return baseResult;
    }

    @Override
    public BaseResult delete(Admin admin) {

        BaseResult baseResult = BaseResult.fail("未知错误");

        try {
            adminDao.delete(admin);
            baseResult = BaseResult.success("数据删除成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return baseResult;
    }
}
