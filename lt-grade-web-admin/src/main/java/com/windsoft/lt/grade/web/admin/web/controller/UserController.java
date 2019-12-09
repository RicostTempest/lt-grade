package com.windsoft.lt.grade.web.admin.web.controller;

import com.windsoft.lt.grade.commons.constant.ConstantUtils;
import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.dto.PageInfo;
import com.windsoft.lt.grade.domain.Admin;
import com.windsoft.lt.grade.domain.User;
import com.windsoft.lt.grade.web.admin.service.AdminService;
import com.windsoft.lt.grade.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description
 * @Author Ricost
 * @Date 2019/12/8 16:15
 * @Version V1.0
 **/
@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public User getUser(Long id){
        User user = null;
        if(id != null){
            user = userService.getById(id);
        }
        else
            user = new User();
        return user;
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(){
        return "user_list";
    }

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String form(){
        return "user_form";
    }

    @ResponseBody
    @RequestMapping(value = "page", method = RequestMethod.GET)
    public PageInfo<User> page(HttpServletRequest request, User user){
        Map<String, Object> result = new HashMap<>();

        String strDraw = request.getParameter("draw");
        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");

        int draw = strDraw == null ? 0 :Integer.parseInt(strDraw);
        int start = strStart == null ? 0 :Integer.parseInt(strStart);
        int length = strLength == null ? 10 :Integer.parseInt(strLength);

        PageInfo<User> pageInfo = userService.page(start, length, draw, user);

        return pageInfo;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(User user, RedirectAttributes redirectAttributes, Model model){
        BaseResult baseResult = userService.save(user);
        //保存成功
        if(baseResult.getStatus() == BaseResult.STATUS_SUCCESS){
            redirectAttributes.addFlashAttribute("baseResult", baseResult);
            return "redirect:/user/list";
        }
        //保存失败
        else{
            model.addAttribute("baseResult", baseResult);
            return "user_form";
        }
    }
}