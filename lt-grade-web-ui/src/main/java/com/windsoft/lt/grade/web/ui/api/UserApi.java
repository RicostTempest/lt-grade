package com.windsoft.lt.grade.web.ui.api;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.utils.HttpClientUtils;
import com.windsoft.lt.grade.commons.utils.MapperUtils;
import com.windsoft.lt.grade.web.ui.dto.User;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserAPI
 * @Description
 * @Author RicostTempest
 * @Date 2019/12/2 22:58
 * @Version V1.0
 **/

public class UserApi {

    public static BaseResult login(User user) throws Exception {

        List<BasicNameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("email",user.getEmail()));
        params.add(new BasicNameValuePair("password",user.getPassword()));

        String json = HttpClientUtils.doPost(API.API_USERS_LOGIN, params.toArray(new BasicNameValuePair[params.size()]));

        BaseResult baseResult = MapperUtils.json2pojo(json, BaseResult.class);

        return baseResult;
    }

    public static BaseResult register(User user) throws Exception {
        List<BasicNameValuePair> params = new ArrayList<>();
        String jsonUser = MapperUtils.obj2json(user);
        params.add(new BasicNameValuePair("userJson",jsonUser));

        String json = HttpClientUtils.doPost(API.API_USERS_REGISTER, params.toArray(new BasicNameValuePair[params.size()]));
        BaseResult result = MapperUtils.json2pojo(json,BaseResult.class);
        result.setData(MapperUtils.json2pojoByTree(json,"data",User.class));
        return result;
    }


}
