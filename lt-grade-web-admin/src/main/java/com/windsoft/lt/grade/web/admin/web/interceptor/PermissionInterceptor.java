package com.windsoft.lt.grade.web.admin.web.interceptor;

import com.windsoft.lt.grade.commons.constant.ConstantUtils;
import com.windsoft.lt.grade.domain.Admin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName PermissionInterceptor
 * @Description 主页拦截器,不登陆无法进入主页
 * @Author RicostTempest
 * @Date 2019/11/25 8:24
 * @Version V1.0
 **/

public class PermissionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

        Admin admin = (Admin) httpServletRequest.getSession().getAttribute(ConstantUtils.SESSION_USER);
        if(admin != null){
            if(modelAndView != null && modelAndView.getViewName() != null){
                if (modelAndView.getViewName().endsWith("login") || modelAndView.getViewName().endsWith("register")){
                httpServletResponse.sendRedirect("/main");
                }
            }
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
