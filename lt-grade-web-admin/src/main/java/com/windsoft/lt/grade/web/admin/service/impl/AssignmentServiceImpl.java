package com.windsoft.lt.grade.web.admin.service.impl;

import com.windsoft.lt.grade.commons.dto.PageInfo;
import com.windsoft.lt.grade.domain.Assignment;
import com.windsoft.lt.grade.web.admin.dao.AssignmentDao;
import com.windsoft.lt.grade.web.admin.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName AssignmentServiceImpl
 * @Description
 * @Author Ricost
 * @Date 2019/12/29 9:28
 * @Version V1.0
 **/
@Service
public class AssignmentServiceImpl implements AssignmentService {

    @Autowired
    private AssignmentDao assignmentDao;

    @Override
    public PageInfo<Assignment> page(int start, int length, int draw, Assignment assignment) {
        Map<String, Object> params = new HashMap<>();
        //获取表格显示的开始位置
        params.put("start",start);
        //获取表格显示的长度
        params.put("length",length);
        //获取显示时的附加属性，查询时使用
        params.put("pageParams",assignment);

        //获取总数据条数
        int count = count(assignment);

        //数据的存储对象
        PageInfo<Assignment> pageInfo = new PageInfo<>();
        pageInfo.setDraw(draw);
        pageInfo.setRecordsTotal(count);
        pageInfo.setRecordsFiltered(count);
        //从数据库获取数据
        pageInfo.setData(assignmentDao.page(params));

        return pageInfo;
    }

    @Override
    public int count(Assignment assignment) {
        return assignmentDao.count(assignment);
    }

    @Override
    public Assignment getById(Long id) {
        return assignmentDao.getById(id);
    }
}