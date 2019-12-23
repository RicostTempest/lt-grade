package com.windsoft.lt.grade.web.api.web.controller.v1;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.LinkResOrg;
import com.windsoft.lt.grade.web.api.service.OrgResLinkService;
import com.windsoft.lt.grade.web.api.web.dto.ResourceDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ResourceController
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 23:34
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "${api.path.v1}/resources")
public class ResourceController {

    @Autowired
    private OrgResLinkService linkService;

    @RequestMapping(value = "getAll/{id}", method = RequestMethod.GET)
    BaseResult getAll(@PathVariable(value = "id")
                              Long id){
        BaseResult result = linkService.getAll(id);

        if(result.getStatus() == BaseResult.STATUS_SUCCESS){
            List<ResourceDTO> resourceDTOS = new ArrayList<ResourceDTO>();
            List<LinkResOrg> resOrgs = (List<LinkResOrg>) result.getData();

            for(LinkResOrg item : resOrgs){
                ResourceDTO resourceDTO = new ResourceDTO();
                BeanUtils.copyProperties(item.getResource(),resourceDTO);
                BeanUtils.copyProperties(item,resourceDTO);
                resourceDTOS.add(resourceDTO);
            }
            result.setData(resourceDTOS);
        }

        return result;
    }
}