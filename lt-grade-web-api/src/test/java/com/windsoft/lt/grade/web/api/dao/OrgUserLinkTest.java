package com.windsoft.lt.grade.web.api.dao;

import com.windsoft.lt.grade.domain.LinkOrgUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName OrgUserLinkTest
 * @Description
 * @Author Ricost
 * @Date 2019/12/16 11:06
 * @Version V1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-context-druid.xml","classpath:spring-context-mybatis.xml"})
public class OrgUserLinkTest {
    @Autowired
    private OrgUserLinkDao linkDao;

    @Test
    public void searchTest(){
        List<LinkOrgUser> linkOrgUsers;
        linkOrgUsers = linkDao.getOrgList(1L);
        System.out.println(linkOrgUsers==null);
        for (LinkOrgUser item: linkOrgUsers
             ) {
            System.out.println("item:" + item);
        }
    }
}