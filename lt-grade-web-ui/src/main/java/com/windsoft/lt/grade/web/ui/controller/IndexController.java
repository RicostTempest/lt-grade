package com.windsoft.lt.grade.web.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName IndexController
 * @Description
 * @Author Ricost
 * @Date 2019/11/29 17:54
 * @Version V1.0
 **/
@Controller
public class IndexController {
    @RequestMapping(value = {"","index"}, method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}