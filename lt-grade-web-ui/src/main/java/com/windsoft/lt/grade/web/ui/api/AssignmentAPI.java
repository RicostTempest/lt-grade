package com.windsoft.lt.grade.web.ui.api;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.utils.HttpClientUtils;
import com.windsoft.lt.grade.commons.utils.MapperUtils;
import com.windsoft.lt.grade.web.ui.dto.Assignment;

import java.util.List;

/**
 * @ClassName AssignmentAPI
 * @Description
 * @Author Ricost
 * @Date 2019/12/22 13:43
 * @Version V1.0
 **/

public class AssignmentAPI {
    public static BaseResult getAll(Long id) throws Exception {

        String json = HttpClientUtils.doGet(API.API_ASSIGNMENT_GET + id);

        BaseResult baseResult = MapperUtils.json2pojo(json, BaseResult.class);

        List<Assignment> assignments = null;
        try {
            assignments = MapperUtils.json2ListByTree(json,"data",Assignment.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        baseResult.setData(assignments);

        return baseResult;
    }
}