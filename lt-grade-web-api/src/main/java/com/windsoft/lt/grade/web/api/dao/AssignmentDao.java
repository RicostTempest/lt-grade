package com.windsoft.lt.grade.web.api.dao;

import com.windsoft.lt.grade.domain.Assignment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName AssignmentDao
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 14:32
 * @Version V1.0
 **/
@Repository
public interface AssignmentDao {
    List<Assignment> getAll(Long id);
}