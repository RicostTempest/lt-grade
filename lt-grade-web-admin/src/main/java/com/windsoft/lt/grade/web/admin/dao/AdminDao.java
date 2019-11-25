package com.windsoft.lt.grade.web.admin.dao;

import com.windsoft.lt.grade.domain.Admin;
import org.springframework.stereotype.Repository;

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
}