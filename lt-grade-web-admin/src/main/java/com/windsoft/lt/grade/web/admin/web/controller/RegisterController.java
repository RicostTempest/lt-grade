package com.windsoft.lt.grade.web.admin.web.controller;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.Admin;
import com.windsoft.lt.grade.web.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @ClassName RegisterController
 * @Description
 * @Author Ricost
 * @Date 2019/11/25 11:33
 * @Version V1.0
 **/
@Controller
public class RegisterController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String save(Admin admin, RedirectAttributes redirectAttributes, Model model){
        BaseResult baseResult = adminService.save(admin);
        //保存成功
        if(baseResult.getStatus() == BaseResult.STATUS_SUCCESS){
            redirectAttributes.addFlashAttribute("baseResult", baseResult);
            return "login";
        }
        //保存失败
        else{
            model.addAttribute("baseResult", baseResult);
            return "redirect:/register";
        }
    }
}