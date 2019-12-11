package com.windsoft.lt.grade.web.admin.dao;

import com.windsoft.lt.grade.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName StudentDao
 * @Description
 * @Author Ricost
 * @Date 2019/12/9 10:11
 * @Version V1.0
 **/
@Repository
public interface StudentDao {
    List<Student> selectAll();
}