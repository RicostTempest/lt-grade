package com.windsoft.lt.grade.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName RegisterController
 * @Description
 * @Author Ricost
 * @Date 2019/11/25 11:33
 * @Version V1.0
 **/
@Controller
public class RegisterController {

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(){
        return "register";
    }
}