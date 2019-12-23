package com.windsoft.lt.grade.web.api.service.impl;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.LinkOrgUser;
import com.windsoft.lt.grade.domain.Organization;
import com.windsoft.lt.grade.domain.User;
import com.windsoft.lt.grade.web.api.dao.OrgUserLinkDao;
import com.windsoft.lt.grade.web.api.service.OrgUserLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName OrgUserLinkServiceImpl
 * @Description
 * @Author Ricost
 * @Date 2019/12/16 13:29
 * @Version V1.0
 **/
@Service
public class OrgUserLinkServiceImpl implements OrgUserLinkService {

    @Autowired
    private OrgUserLinkDao orgUserLinkDao;

    @Override
    public BaseResult selectSelf(User user) {
        List<Organization> organizations;
        BaseResult result = BaseResult.fail();

        organizations = orgUserLinkDao.selectSelf(user.getUid());

        //验证获取成功
        if (organizations != null){
            result = BaseResult.success("获取成功",organizations);
        }
        else if( organizations.size() == 0){
            result = BaseResult.fail("数据为空",null);
        }
        //验证获取失败
        else {
            result.setMessage("获取失败");
        }

        return result;
    }

    @Override
    public BaseResult getOrgList(Long uid) {
        List<LinkOrgUser> orgUsers;
        BaseResult result = BaseResult.fail();

        orgUsers = orgUserLinkDao.getOrgList(uid);

        //验证获取成功
        if (orgUsers != null){
            result = BaseResult.success("获取成功",orgUsers);
        }
        else if( orgUsers.size() == 0){
            result = BaseResult.fail("数据为空",null);
        }
        //验证获取失败
        else {
            result.setMessage("获取失败");
        }

        return result;

    }

    @Override
    public BaseResult getKeyWordList(String keyword) {
        List<LinkOrgUser> orgUsers;
        BaseResult result = BaseResult.fail();

        orgUsers = orgUserLinkDao.search(keyword);

        //验证获取成功
        if (orgUsers != null){
            result = BaseResult.success("获取成功",orgUsers);
        }
        else if( orgUsers.size() == 0){
            result = BaseResult.fail("数据为空",null);
        }
        //验证获取失败
        else {
            result.setMessage("获取失败");
        }

        return result;

    }

    @Override
    public BaseResult getMember(Long id) {
        List<LinkOrgUser> orgUsers;
        BaseResult result = BaseResult.fail();

        orgUsers = orgUserLinkDao.getMember(id);

        //验证获取成功
        if (orgUsers != null){
            result = BaseResult.success("获取成功",orgUsers);
        }
        else if( orgUsers.size() == 0){
            result = BaseResult.fail("数据为空",null);
        }
        //验证获取失败
        else {
            result.setMessage("获取失败");
        }

        return result;
    }
}