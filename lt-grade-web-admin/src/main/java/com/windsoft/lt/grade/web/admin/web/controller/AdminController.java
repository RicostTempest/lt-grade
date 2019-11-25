package com.windsoft.lt.grade.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName AdminController
 * @Description
 * @Author Ricost
 * @Date 2019/11/25 18:19
 * @Version V1.0
 **/
@Controller
@RequestMapping(value = "admin")
public class AdminController {

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(){
        return "admin_list";
    }

}