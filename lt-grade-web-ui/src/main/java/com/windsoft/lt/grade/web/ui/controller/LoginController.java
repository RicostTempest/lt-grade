package com.windsoft.lt.grade.web.ui.controller;

import com.windsoft.lt.grade.commons.constant.ConstantUtils;
import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.utils.CookieUtils;
import com.windsoft.lt.grade.web.ui.api.UserApi;
import com.windsoft.lt.grade.web.ui.dto.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName LoginController
 * @Description
 * @Author Ricost
 * @Date 2019/12/2 8:29
 * @Version V1.0
 **/
@Controller
public class LoginController {
    public static final String COOKIE_NAME_USER_INFO = "user";

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(HttpServletRequest httpServletRequest){
        String userInfo = CookieUtils.getCookieValue(httpServletRequest,COOKIE_NAME_USER_INFO);

        if(StringUtils.isNotBlank(userInfo)){
            String[] userInfoArray = userInfo.split(":");
            String email = userInfoArray[0];
            String password = userInfoArray[1];
            httpServletRequest.setAttribute("email",email);
            httpServletRequest.setAttribute("password",password);
            httpServletRequest.setAttribute("isRemember",true);
        }


        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(User user,
                        @RequestParam(required = false) String isRemember,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        Model model) throws Exception {
        boolean remember = isRemember == null ? false : true;

        if(!remember){
            CookieUtils.deleteCookie(request,response,COOKIE_NAME_USER_INFO);
        }

        BaseResult baseResult = UserApi.login(user);

        if (baseResult.getStatus() == BaseResult.STATUS_FAIL){
            model.addAttribute("message",baseResult.getMessage());
            return "login";
        }
        //登录成功
        else{
            //记住登录信息
            if(remember){
                CookieUtils.setCookie(request,
                        response,
                        COOKIE_NAME_USER_INFO,String.format("%s:%s",user.getEmail(),user.getPassword()),
                        7*24*60*60);
            }

            //将登陆信息放入会话
            request.getSession().setAttribute(ConstantUtils.SESSION_USER, baseResult.getData());
            return "redirect:/main";
        }
    }
}