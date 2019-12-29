package com.windsoft.lt.grade.web.api.service.impl;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.Forum;
import com.windsoft.lt.grade.web.api.dao.ForumDao;
import com.windsoft.lt.grade.web.api.service.ForumService;
import com.windsoft.lt.grade.web.api.web.dto.ForumDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName ForumServiceImpl
 * @Description
 * @Author Ricost
 * @Date 2019/12/23 9:20
 * @Version V1.0
 **/
@Service
public class ForumServiceImpl implements ForumService {
    @Autowired
    private ForumDao forumDao;

    public BaseResult getAll(Long id){
        List<Forum> forums = forumDao.getAll(id);
        BaseResult result = null;
        if(forums == null){
            result = BaseResult.fail("查找出错");
        }
        else
            result = BaseResult.success("获取成功", forums);

        return result;
    }

    @Override
    public BaseResult save(ForumDTO forumDTO) {
        BaseResult result = null;
        if(forumDTO.getFomId() == null){
            forumDTO.setCreated(new Date());
            forumDTO.setUpdated(new Date());
            forumDTO.setReply(0L);
            forumDao.insert(forumDTO);
            result = BaseResult.success("插入成功");
        }
        else
            result = BaseResult.fail();
        return result;
    }
}