package com.windsoft.lt.grade.web.admin.dao;

import com.windsoft.lt.grade.domain.Assignment;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName AssignmentDao
 * @Description
 * @Author Ricost
 * @Date 2019/12/29 9:21
 * @Version V1.0
 **/
@Repository
public interface AssignmentDao {
    //获取查询后的全部数据
    List<Assignment> page(Map<String, Object> params);
    int count(Assignment assignment);
    //获取单挑数据，根据ID查询
    Assignment getById(Long id);
}