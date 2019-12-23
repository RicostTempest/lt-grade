package com.windsoft.lt.grade.web.ui.api;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.utils.HttpClientUtils;
import com.windsoft.lt.grade.commons.utils.MapperUtils;
import com.windsoft.lt.grade.web.ui.dto.Member;
import com.windsoft.lt.grade.web.ui.dto.Organization;

import java.util.List;

/**
 * @ClassName OrganizationAPI
 * @Description
 * @Author Ricost
 * @Date 2019/12/20 12:01
 * @Version V1.0
 **/

public class OrganizationAPI {

    public static BaseResult getAll(Long uid) throws Exception {

        String json = HttpClientUtils.doGet(API.API_ORGANIZATION_GET + uid);

        BaseResult baseResult = MapperUtils.json2pojo(json, BaseResult.class);

        List<Organization> organizations = null;
        try {
            organizations = MapperUtils.json2ListByTree(json,"data",Organization.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        baseResult.setData(organizations);

        return baseResult;
    }

    public static BaseResult getMember(Long id) throws Exception {
        String json  = HttpClientUtils.doGet(API.API_RESOURCE_GET_MEMBER + id);

        BaseResult result = MapperUtils.json2pojo(json, BaseResult.class);

        List<Member> members = null;
        try {
            members = MapperUtils.json2ListByTree(json,"data",Member.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        result.setData(members);

        return result;
    }
}