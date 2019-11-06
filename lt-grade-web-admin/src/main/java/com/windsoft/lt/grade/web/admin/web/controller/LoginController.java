package com.windsoft.lt.grade.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName LoginController
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/6 14:50
 * @Version V1.0
 **/

@Controller
public class LoginController {

    @RequestMapping(value = {"","login"}, method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}
