package com.windsoft.lt.grade.web.ui.controller;

import com.windsoft.lt.grade.commons.constant.ConstantUtils;
import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.web.ui.api.*;
import com.windsoft.lt.grade.web.ui.dto.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @ClassName OrganizationController
 * @Description
 * @Author RicostTempest
 * @Date 2019/12/1 21:57
 * @Version V1.0
 **/
@Controller
@RequestMapping(value = "organization")
public class OrganizationController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String organization(Long id, Model model, HttpServletRequest request) throws Exception {
        BaseResult resultRes = ResourceAPI.getAll(id);
        BaseResult resultMember = OrganizationAPI.getMember(id);
        BaseResult resultAss = AssignmentAPI.getAll(id);

        List<Assignment> assignments = (List<Assignment>) resultAss.getData();
        Map<String,List<Assignment>> assCatalog = new HashMap<String, List<Assignment>>();
        List<Assignment> work = new ArrayList<>();
        List<Assignment> experiment = new ArrayList<>();
        List<Assignment> test = new ArrayList<>();
        for (Assignment item :assignments){
            switch (item.getType()){
                case 0 : experiment.add(item);break;
                case 1 : work.add(item);break;
                case 3 : test.add(item);break;
            }
        }
        assCatalog.put("experiment",experiment);
        assCatalog.put("work",work);
        assCatalog.put("tets",test);

        model.addAttribute("resources",resultRes.getData());
        model.addAttribute("member",resultMember.getData());
        model.addAttribute("assignment",assCatalog);

        request.getSession().setAttribute(ConstantUtils.SESSION_ORG_ID, id);

        return "organization";
    }

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String created(){
        return "organization_form";
    }

    @RequestMapping(value = "send", method = RequestMethod.POST)
    public void send(String document, HttpServletRequest request) throws Exception {
        Long id = (Long) request.getSession().getAttribute(ConstantUtils.SESSION_ORG_ID);
        User user = (User) request.getSession().getAttribute(ConstantUtils.SESSION_USER);

        Forum forum = new Forum();
        forum.setOrgId(id);
        forum.setUid(user.getUid());

        forum.setDocument(document);

        BaseResult result = BaseResult.fail();
        result = ForumAPI.sendMessage(forum);

    }

    @RequestMapping(value = "task", method = RequestMethod.GET)
    public String taskForm(){
        return "assignment_form";
    }

    @RequestMapping(value = "task/create", method = RequestMethod.POST)
    public String createTask(Assignment assignment, Resource resource, HttpServletRequest request){
        Long id = (Long) request.getSession().getAttribute(ConstantUtils.SESSION_ORG_ID);
        return "";
    }


    @RequestMapping(value = "created", method = RequestMethod.POST)
    public String createOrganization(Organization organization, HttpServletRequest request) throws Exception {
        User user = (User) request.getSession().getAttribute(ConstantUtils.SESSION_USER);
        organization.setOrgType(0);
        organization.setCreated(new Date());
        organization.setUid(user.getUid());

        BaseResult result = OrganizationAPI.created(organization);

        if(result.getStatus() == BaseResult.STATUS_SUCCESS)
            return "redirect:/main";
        return "#";
    }
}
