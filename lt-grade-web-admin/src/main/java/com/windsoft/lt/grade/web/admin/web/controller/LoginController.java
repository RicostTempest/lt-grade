package com.windsoft.lt.grade.web.admin.web.controller;

import com.windsoft.lt.grade.constant.ConstantUtils;
import com.windsoft.lt.grade.domain.Admin;
import com.windsoft.lt.grade.utils.CookieUtils;
import com.windsoft.lt.grade.web.admin.service.AdminService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;

/**
 * @ClassName LoginController
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/6 14:50
 * @Version V1.0
 **/

@Controller
public class LoginController {

    @Autowired
    private AdminService adminService;

    public static final String COOKIE_NAME_ADMIN_INFO = "adminInfo";

    @RequestMapping(value = {"","login"}, method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response){
        String adminInfo = CookieUtils.getCookieValue(request, COOKIE_NAME_ADMIN_INFO);

        if (StringUtils.isNotBlank(adminInfo)) {
            String[] adminInfoArray = adminInfo.split(":");
            String email = adminInfoArray[0];
            String password = adminInfoArray[1];
            request.setAttribute("email",email);
            request.setAttribute("password",password);
            request.setAttribute("isRemember",true);

//            Admin admin = adminService.login(email,password);
//
//            if (admin == null){
//                return "login";
//            }else{
//                return "main";
//            }
        }
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam(required = true) String email,
                        @RequestParam(required = true) String password,
                        @RequestParam(required = false) String isRemember,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        Model model){
        boolean remember = isRemember == null ? false : true;

        if(!remember){
            CookieUtils.deleteCookie(request,response,COOKIE_NAME_ADMIN_INFO);
        }

        Admin admin = adminService.login(email,password);

        if (admin == null){
            model.addAttribute("message","用户名或密码错误，请重新输入");
            return "login";
        }
        //登录成功
        else{
            //记住登录信息
            if(remember){
                CookieUtils.setCookie(request,
                        response,
                        COOKIE_NAME_ADMIN_INFO,String.format("%s:%s",email,password),
                        7*24*60*60);
            }

            //将登陆信息放入会话
            request.getSession().setAttribute(ConstantUtils.SESSION_ADMIN, admin);
            return "redirect:/main";
        }
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response){

        request.getSession().invalidate();

        return "redirect:/login";
    }
}
