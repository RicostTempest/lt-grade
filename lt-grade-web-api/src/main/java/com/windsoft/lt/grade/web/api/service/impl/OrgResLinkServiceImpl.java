package com.windsoft.lt.grade.web.api.service.impl;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.LinkResOrg;
import com.windsoft.lt.grade.web.api.dao.OrgResLinkDao;
import com.windsoft.lt.grade.web.api.service.OrgResLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName OrgResLinkServiceImpl
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 23:30
 * @Version V1.0
 **/
@Service
public class OrgResLinkServiceImpl implements OrgResLinkService {

    @Autowired
    private OrgResLinkDao linkDao;

    @Override
    public BaseResult getAll(Long id) {
        List<LinkResOrg> linkResOrgs;
        BaseResult result = BaseResult.fail();

        linkResOrgs = linkDao.getAll(id);

        //验证获取成功
        if (linkResOrgs != null){
            result = BaseResult.success("获取成功",linkResOrgs);
        }
        else if( linkResOrgs.size() == 0){
            result = BaseResult.fail("数据为空",null);
        }
        //验证获取失败
        else {
            result.setMessage("获取失败");
        }

        return result;
    }
}