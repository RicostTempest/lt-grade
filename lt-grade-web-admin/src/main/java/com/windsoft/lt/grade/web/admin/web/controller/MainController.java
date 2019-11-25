package com.windsoft.lt.grade.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName MainController
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/24 20:58
 * @Version V1.0
 **/
@Controller
public class MainController {

    /**
     * 跳转到首页
     * @return
     */
    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String main(){
        return "main";
    }
}
