package com.windsoft.lt.grade.web.admin.service.test;

import com.windsoft.lt.grade.web.admin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName UserServiceTest
 * @Description
 * @Author Ricost
 * @Date 2019/12/8 17:16
 * @Version V1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-context-druid.xml","classpath:spring-context-mybatis.xml"})
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void page(){
        System.out.println(userService.page(0,10,1,null).getData());
    }
}