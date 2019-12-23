package com.windsoft.lt.grade.web.ui.api;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.utils.HttpClientUtils;
import com.windsoft.lt.grade.commons.utils.MapperUtils;
import com.windsoft.lt.grade.web.ui.dto.Resource;

import java.util.List;

/**
 * @ClassName ResourceAPI
 * @Description
 * @Author Ricost
 * @Date 2019/12/22 10:13
 * @Version V1.0
 **/

public class ResourceAPI {
    public static BaseResult getAll(Long id) throws Exception {

        String json = HttpClientUtils.doGet(API.API_RESOURCE_GET + id);

        BaseResult baseResult = MapperUtils.json2pojo(json, BaseResult.class);

        List<Resource> organizations = null;
        try {
            organizations = MapperUtils.json2ListByTree(json,"data",Resource.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        baseResult.setData(organizations);

        return baseResult;
    }
}