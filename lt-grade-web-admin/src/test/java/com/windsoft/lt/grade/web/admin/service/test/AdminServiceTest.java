package com.windsoft.lt.grade.web.admin.service.test;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.Admin;
import com.windsoft.lt.grade.web.admin.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName AdminServiceTest
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/24 15:17
 * @Version V1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-context-druid.xml","classpath:spring-context-mybatis.xml"})
public class AdminServiceTest {
    @Autowired
    private AdminService adminService;

    @Test
    public void testLogin(){
        BaseResult admin = adminService.login("ricost@foxmail.com","123456");
        System.out.println(admin);
    }

    @Test
    public void testGetId(){
        Admin admin = adminService.getById(1L);
        System.out.println(admin);
    }
}
