package com.windsoft.lt.grade.web.api.service;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.web.api.web.dto.ForumDTO;

/**
 * @InterfaceName ForumService
 * @Description
 * @Author Ricost
 * @Date 2019/12/23 9:20
 * @Version V1.0
 **/

public interface ForumService {
    BaseResult getAll(Long id);
    BaseResult save(ForumDTO forumDTO);
}