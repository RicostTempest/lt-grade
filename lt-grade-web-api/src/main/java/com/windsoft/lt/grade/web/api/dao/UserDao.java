package com.windsoft.lt.grade.web.api.dao;

import com.windsoft.lt.grade.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @InterfaceName UserDao
 * @Description
 * @Author Ricost
 * @Date 2019/12/2 10:53
 * @Version V1.0
 **/
@Repository
@Transactional
public interface UserDao {
    User getByEmail(String email);
    void insert(User user);
    void update(User user);
}