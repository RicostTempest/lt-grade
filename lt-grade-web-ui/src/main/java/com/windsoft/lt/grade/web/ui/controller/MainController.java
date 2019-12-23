package com.windsoft.lt.grade.web.ui.controller;

import com.windsoft.lt.grade.commons.constant.ConstantUtils;
import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.web.ui.api.OrganizationAPI;
import com.windsoft.lt.grade.web.ui.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName MainController
 * @Description
 * @Author RicostTempest
 * @Date 2019/12/1 20:32
 * @Version V1.0
 **/
@Controller
public class MainController {

    @RequestMapping(value = "main",method = RequestMethod.GET)
    public String main(Model model, HttpServletRequest request) throws Exception {
        User user = (User) request.getSession().getAttribute(ConstantUtils.SESSION_USER);
        BaseResult result = OrganizationAPI.getAll(user.getUid());

        model.addAttribute("organizations", result.getData());

        return "main";
    }
}
