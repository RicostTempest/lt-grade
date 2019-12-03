package com.windsoft.lt.grade.web.ui.controller;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RegisterController {

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(String email, String password){
        BaseResult result = BaseResult.fail();

        return "register";
    }
}