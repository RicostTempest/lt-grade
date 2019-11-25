package com.windsoft.lt.grade.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName TestController
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/16 14:09
 * @Version V1.0
 **/
@Controller
public class TestController {
    @RequestMapping(value = {"register"}, method = RequestMethod.GET)
    public String register(){
        return "register";
    }
}
