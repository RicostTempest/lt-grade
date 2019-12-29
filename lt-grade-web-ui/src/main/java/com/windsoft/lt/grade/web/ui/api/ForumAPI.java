package com.windsoft.lt.grade.web.ui.api;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.utils.HttpClientUtils;
import com.windsoft.lt.grade.commons.utils.MapperUtils;
import com.windsoft.lt.grade.web.ui.dto.Forum;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ForumAPI
 * @Description
 * @Author Ricost
 * @Date 2019/12/23 15:05
 * @Version V1.0
 **/

public class ForumAPI {
    public static BaseResult sendMessage(Forum forum) throws Exception {
        List<BasicNameValuePair> params = new ArrayList<>();
        String jsonUser = MapperUtils.obj2json(forum);
        params.add(new BasicNameValuePair("json",jsonUser));

        String json = HttpClientUtils.doPost(API.API_FORUM_SEND, params.toArray(new BasicNameValuePair[params.size()]));
        BaseResult result = MapperUtils.json2pojo(json,BaseResult.class);
        return result;
    }
}