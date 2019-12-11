package com.windsoft.lt.grade.web.admin.dao;

import com.windsoft.lt.grade.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserDao
 * @Description
 * @Author Ricost
 * @Date 2019/12/8 16:19
 * @Version V1.0
 **/
@Repository
public interface UserDao {

    User getById(Long id);

    List<User> page(Map<String, Object> params);

    int count(User user);

    void insert(User user);

    void update(User user);

    void delete(User user);
}