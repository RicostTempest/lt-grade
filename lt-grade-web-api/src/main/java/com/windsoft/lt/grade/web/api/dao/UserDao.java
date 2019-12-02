package com.windsoft.lt.grade.web.api.dao;

import com.windsoft.lt.grade.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @InterfaceName UserDao
 * @Description
 * @Author Ricost
 * @Date 2019/12/2 10:53
 * @Version V1.0
 **/
@Repository
public interface UserDao {
    public User getByEmail(String email);
}