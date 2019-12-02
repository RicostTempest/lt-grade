package com.windsoft.lt.grade.web.api.service;

import com.windsoft.lt.grade.domain.User;
import com.windsoft.lt.grade.web.api.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName UserTest
 * @Description
 * @Author Ricost
 * @Date 2019/12/2 13:53
 * @Version V1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-context-druid.xml","classpath:spring-context-mybatis.xml"})
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    public void getByEmail(){
        userService.login("760699178@qq.com","123456");
        System.out.println();
    }
}