package com.windsoft.lt.grade.web.ui.api;

/**
 * @ClassName API
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/21 20:31
 * @Version V1.0
 **/

public class API {
    //主机地址
    public static final String HOST = "http://localhost:8082/api/v1";

    //会员管理接口 - 登录
    public static final String API_USERS_LOGIN = HOST + "/users/login";

    public static final String API_USERS_REGISTER = HOST + "/users/register";

}
