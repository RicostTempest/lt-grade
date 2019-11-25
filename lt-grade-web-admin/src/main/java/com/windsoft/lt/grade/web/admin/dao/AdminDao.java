package com.windsoft.lt.grade.web.admin.dao;

import com.windsoft.lt.grade.domain.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName AdminDao
 * @Description
 * @Author RicostTempest
 * @Date 2019/11/24 14:16
 * @Version V1.0
 **/
@Repository
public interface AdminDao {
    Admin getByEmail(String email);

    Admin getById(Long id);
    /**
     * 分页查询
     * @param params 两个参数，start/记录开始的位置，length/每页记录数
     * @return
     */
    List<Admin> page(Map<String, Object> params);

    /**
     * 查询总数量
     * @return
     */
    int count(Admin admin);
}