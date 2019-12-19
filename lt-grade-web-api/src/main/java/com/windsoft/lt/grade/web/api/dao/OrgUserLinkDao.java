package com.windsoft.lt.grade.web.api.dao;

import com.windsoft.lt.grade.domain.LinkOrgUser;
import com.windsoft.lt.grade.domain.Organization;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName OrgUserLinkDao
 * @Description
 * @Author Ricost
 * @Date 2019/12/12 11:11
 * @Version V1.0
 **/
@Repository
public interface OrgUserLinkDao {
    List<Organization> selectSelf(Long uid);
    List<LinkOrgUser> getOrgList(@Param("uid") Long uid);
    List<LinkOrgUser> search(String keyword);
    List<LinkOrgUser> getMember(Long id);

}