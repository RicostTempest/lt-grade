package com.windsoft.lt.grade.web.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName OrganizationController
 * @Description
 * @Author RicostTempest
 * @Date 2019/12/1 21:57
 * @Version V1.0
 **/
@Controller
public class OrganizationController {

    @RequestMapping(value = "organization", method = RequestMethod.GET)
    public String organization(){
        return "organization";
    }
}
