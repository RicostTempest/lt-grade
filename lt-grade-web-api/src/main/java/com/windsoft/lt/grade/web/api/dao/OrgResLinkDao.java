package com.windsoft.lt.grade.web.api.dao;

import com.windsoft.lt.grade.domain.LinkResOrg;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName OrgResLinkDao
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 20:57
 * @Version V1.0
 **/
@Repository
public interface OrgResLinkDao {
    List<LinkResOrg> getAll(Long id);
}