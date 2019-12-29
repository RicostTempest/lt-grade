package com.windsoft.lt.grade.web.admin.web.controller;

import com.windsoft.lt.grade.commons.dto.PageInfo;
import com.windsoft.lt.grade.domain.Assignment;
import com.windsoft.lt.grade.web.admin.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName AssignmentController
 * @Description
 * @Author Ricost
 * @Date 2019/12/29 9:34
 * @Version V1.0
 **/
@Controller
@RequestMapping(value = "assignment")
public class AssignmentController {
    @Autowired
    AssignmentService assignmentService;

    //在每一个页面中初始添加一个Model值
    @ModelAttribute
    public Assignment getUser(Long uid){
        Assignment assignment = null;
        if(uid != null){
            assignment = assignmentService.getById(uid);
        }
        else
            assignment = new Assignment();
        return assignment;
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(){
        return "assignment_list";
    }

    @ResponseBody
    @RequestMapping(value = "page", method = RequestMethod.GET)
    public PageInfo<Assignment> page(HttpServletRequest request, Assignment assignment){
        Map<String, Object> result = new HashMap<>();

        String strDraw = request.getParameter("draw");
        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");

        int draw = strDraw == null ? 0 :Integer.parseInt(strDraw);
        int start = strStart == null ? 0 :Integer.parseInt(strStart);
        int length = strLength == null ? 10 :Integer.parseInt(strLength);

        PageInfo<Assignment> pageInfo = assignmentService.page(start, length, draw, assignment);

        return pageInfo;
    }

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String form(Model model){

        return "assignment_form";
    }

}