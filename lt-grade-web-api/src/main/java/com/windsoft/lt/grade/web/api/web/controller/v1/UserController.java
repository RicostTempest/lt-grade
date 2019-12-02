package com.windsoft.lt.grade.web.api.web.controller.v1;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.User;
import com.windsoft.lt.grade.web.api.dao.UserDao;
import com.windsoft.lt.grade.web.api.service.UserService;
import com.windsoft.lt.grade.web.api.web.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description
 * @Author RicostTempest
 * @Date 2019/12/2 18:23
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "${api.path.v1}/users")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "login", method = RequestMethod.POST)
    public BaseResult login(String email, String password){
        BaseResult baseResult = BaseResult.fail();
        baseResult = userService.login(email, password);
        if(baseResult.getStatus() == BaseResult.STATUS_SUCCESS){
            UserDTO userDTO = new UserDTO();
            User user = (User) baseResult.getData();

            BeanUtils.copyProperties(user,userDTO);
        }

        return baseResult;
    }
}
