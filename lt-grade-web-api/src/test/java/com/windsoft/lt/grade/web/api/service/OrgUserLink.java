package com.windsoft.lt.grade.web.api.service;

import com.windsoft.lt.grade.domain.LinkOrgUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName OrgUserLink
 * @Description
 * @Author Ricost
 * @Date 2019/12/24 11:35
 * @Version V1.0
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-context-druid.xml","classpath:spring-context-mybatis.xml"})
public class OrgUserLink {

    @Autowired
    private OrgUserLinkService orgUserLinkService;

    @Test
    public void createdTest(){
        LinkOrgUser linkOrgUser = new LinkOrgUser();
    }
}