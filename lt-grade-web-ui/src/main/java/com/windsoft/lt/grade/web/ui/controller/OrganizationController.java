package com.windsoft.lt.grade.web.ui.controller;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.web.ui.api.AssignmentAPI;
import com.windsoft.lt.grade.web.ui.api.OrganizationAPI;
import com.windsoft.lt.grade.web.ui.api.ResourceAPI;
import com.windsoft.lt.grade.web.ui.dto.Assignment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String organization(Long id, Model model) throws Exception {
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

        return "organization";
    }

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String created(){
        return "organization_form";
    }
}
