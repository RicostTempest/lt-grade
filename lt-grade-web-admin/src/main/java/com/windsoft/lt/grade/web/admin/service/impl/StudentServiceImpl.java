package com.windsoft.lt.grade.web.admin.service.impl;

import com.windsoft.lt.grade.domain.Student;
import com.windsoft.lt.grade.web.admin.dao.StudentDao;
import com.windsoft.lt.grade.web.admin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Description
 * @Author Ricost
 * @Date 2019/12/9 10:35
 * @Version V1.0
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }
}