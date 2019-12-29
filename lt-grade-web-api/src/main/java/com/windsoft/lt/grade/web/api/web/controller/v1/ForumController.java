package com.windsoft.lt.grade.web.api.web.controller.v1;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.commons.utils.MapperUtils;
import com.windsoft.lt.grade.domain.Forum;
import com.windsoft.lt.grade.web.api.service.ForumService;
import com.windsoft.lt.grade.web.api.web.dto.ForumDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ForumController
 * @Description
 * @Author Ricost
 * @Date 2019/12/23 9:28
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "${api.path.v1}/forums")
public class ForumController {
    @Autowired
    private ForumService forumService;

    @RequestMapping(value = "getAll/{id}", method = RequestMethod.GET)
    public BaseResult getAll(@PathVariable(value = "id") Long id){
        BaseResult result = forumService.getAll(id);
        List<ForumDTO> forumDTOS = new ArrayList<ForumDTO>();

        if(result.getStatus() == BaseResult.STATUS_SUCCESS){
            List<Forum> forums = (List<Forum>) result.getData();

            for(Forum item : forums){
                ForumDTO forumDTO = new ForumDTO();
                BeanUtils.copyProperties(item.getUser(),forumDTO);
                BeanUtils.copyProperties(item.getOrganization(),forumDTO);
                BeanUtils.copyProperties(item,forumDTO);
                forumDTOS.add(forumDTO);
            }

            result.setData(forumDTOS);
            return result;
        }
        return BaseResult.fail("请求失败");
    }

    @RequestMapping(value = "send", method = RequestMethod.POST)
    public BaseResult send(String json) throws Exception {
        BaseResult result = BaseResult.fail();
        ForumDTO forumDTO =  MapperUtils.json2pojo(json, ForumDTO.class);
//        Forum forum = new Forum();
//        BeanUtils.copyProperties(forumDTO,forum);
//        BeanUtils.copyProperties(forumDTO,forum.getOrganization());
//        BeanUtils.copyProperties(forumDTO,forum.getUser());
        result = forumService.save(forumDTO);
        return result;
    }

}