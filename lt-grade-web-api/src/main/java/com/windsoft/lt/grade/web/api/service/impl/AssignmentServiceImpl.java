package com.windsoft.lt.grade.web.api.service.impl;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.Assignment;
import com.windsoft.lt.grade.web.api.dao.AssignmentDao;
import com.windsoft.lt.grade.web.api.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AssignmentServiceImpl
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 14:51
 * @Version V1.0
 **/
@Service
public class AssignmentServiceImpl implements AssignmentService {

    @Autowired
    private AssignmentDao assignmentDao;
    @Override
    public BaseResult getAll(Long id) {
        BaseResult result = BaseResult.fail();
        List<Assignment> assignments = assignmentDao.getAll(id);
        result = BaseResult.success("查找成功",assignments);
        return result;
    }
}