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
    public static final String HOST = "http://localhost:8085/api/v1";

    public static final String USERS = "/users";

    public static final String ORGANIZATION = "/organizations";

    public static final String RESOURCE = "/resources";

    public static final String ASSIGNMENT = "/assignments";

    //会员管理接口 - 登录
    public static final String API_USERS_LOGIN = HOST + USERS + "/login";

    public static final String API_USERS_REGISTER = HOST + USERS + "/register";

    public static final String API_ORGANIZATION_GET = HOST + ORGANIZATION + "/getAll/";

    public static final String API_RESOURCE_GET = HOST + RESOURCE + "/getAll/";

    public static final String API_RESOURCE_GET_MEMBER = HOST + ORGANIZATION + "/getMember/";

    public static final String API_ASSIGNMENT_GET = HOST + ASSIGNMENT + "/getAll/";

}
