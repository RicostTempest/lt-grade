package com.windsoft.lt.grade.web.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName LoginController
 * @Description
 * @Author Ricost
 * @Date 2019/12/2 8:29
 * @Version V1.0
 **/
@Controller
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}