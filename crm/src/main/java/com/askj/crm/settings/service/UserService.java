package com.askj.crm.settings.service;

import com.askj.crm.settings.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    User queryUserByLoginActAndPwd(Map<String, Object> map);

    //    模态窗口
    List<User> queryAllUsers();

    int saveNewUser(User user);
}
