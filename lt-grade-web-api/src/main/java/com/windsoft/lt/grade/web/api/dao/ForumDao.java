package com.windsoft.lt.grade.web.api.dao;

import com.windsoft.lt.grade.domain.Forum;
import com.windsoft.lt.grade.web.api.web.dto.ForumDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName ForumDao
 * @Description
 * @Author Ricost
 * @Date 2019/12/23 9:12
 * @Version V1.0
 **/
@Repository
public interface ForumDao {
    List<Forum> getAll(Long id);
    void insert(ForumDTO forumDTO);
}