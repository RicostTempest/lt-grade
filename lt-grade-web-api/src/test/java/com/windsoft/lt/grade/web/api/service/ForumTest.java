package com.windsoft.lt.grade.web.api.service;

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
public class ForumTest {

    @Autowired
    ForumService forumService;

    @Test
    public void getAll(){

        System.out.println(forumService.getAll(1L));
    }
}