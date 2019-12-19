package com.windsoft.lt.grade.web.api.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName AssignmentDaoTest
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 14:45
 * @Version V1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-context-druid.xml","classpath:spring-context-mybatis.xml"})
public class AssignmentDaoTest {
    @Autowired
    private AssignmentDao assDao;

    @Test
    public void getAll(){
        System.out.println(assDao.getAll(1L));
    }
}