package com.windsoft.lt.grade.web.ui.controller;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.web.ui.api.UserAPI;
import com.windsoft.lt.grade.web.ui.dto.User;
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
    public String register(User user) throws Exception {
        BaseResult result = BaseResult.fail();
        result = UserAPI.register(user);

        User userDTO = (User) result.getData();

        return "register";
    }
}