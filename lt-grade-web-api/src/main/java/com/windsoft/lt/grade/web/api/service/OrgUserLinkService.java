package com.windsoft.lt.grade.web.api.service;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.LinkOrgUser;
import com.windsoft.lt.grade.domain.User;

/**
 * @InterfaceName OrgUserLinkService
 * @Description
 * @Author Ricost
 * @Date 2019/12/16 13:28
 * @Version V1.0
 **/

public interface OrgUserLinkService {
    BaseResult selectSelf(User user);
    BaseResult getOrgList(Long uid);
    BaseResult getKeyWordList(String keyword);
    BaseResult getMember(Long id);
    BaseResult create(LinkOrgUser orgUser);
}