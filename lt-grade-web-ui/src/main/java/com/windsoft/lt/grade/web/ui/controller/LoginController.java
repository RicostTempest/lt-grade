package com.windsoft.lt.grade.web.ui.controller;

import com.windsoft.lt.grade.web.ui.api.UserApi;
import com.windsoft.lt.grade.web.ui.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(User userData, Model model, HttpServletRequest request) throws Exception {
        User user = UserApi.login(userData);

        if(user == null){

        }

        return "";
    }
}