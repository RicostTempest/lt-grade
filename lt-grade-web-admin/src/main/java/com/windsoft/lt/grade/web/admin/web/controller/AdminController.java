package com.windsoft.lt.grade.web.admin.web.controller;

import com.windsoft.lt.grade.domain.Admin;
import com.windsoft.lt.grade.commons.dto.PageInfo;
import com.windsoft.lt.grade.web.admin.service.AdminService;
import com.windsoft.lt.grade.commons.dto.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName AdminController
 * @Description
 * @Author Ricost
 * @Date 2019/11/25 18:19
 * @Version V1.0
 **/
@Controller
@RequestMapping(value = "admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    public Admin getAdmin(Long id){
        Admin admin = null;
        if(id == null){
            adminService.getById(id);
        }else{
            admin = new Admin();
        }
        return admin;
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(){
        return "admin_list";
    }

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String form(){
        return "admin_form";
    }


    @ResponseBody
    @RequestMapping(value = "page", method = RequestMethod.GET)
    public PageInfo<Admin> page(HttpServletRequest request, Admin admin){
        Map<String, Object> result = new HashMap<>();

        String strDraw = request.getParameter("draw");
        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");

        int draw = strDraw == null ? 0 :Integer.parseInt(strDraw);
        int start = strStart == null ? 0 :Integer.parseInt(strStart);
        int length = strLength == null ? 10 :Integer.parseInt(strLength);

        PageInfo<Admin> pageInfo = adminService.page(start, length, draw, admin);

        return pageInfo;
    }

    @RequestMapping(value = "detail", method = RequestMethod.GET)
    public String detail(){
        return "admin_detail";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Admin admin, RedirectAttributes redirectAttributes, Model model){
        BaseResult baseResult = adminService.save(admin);
        //保存成功
        if(baseResult.getStatus() == BaseResult.STATUS_SUCCESS){
            redirectAttributes.addFlashAttribute("baseResult", baseResult);
            return "redirect:/admin/list";
        }
        //保存失败
        else{
            model.addAttribute("baseResult", baseResult);
            return "admin_form";
        }
    }
}