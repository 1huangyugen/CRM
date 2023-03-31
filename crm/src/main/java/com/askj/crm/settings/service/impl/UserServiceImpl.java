package com.askj.crm.settings.service.impl;

import com.askj.crm.settings.domain.User;
import com.askj.crm.settings.mapper.UserMapper;
import com.askj.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByLoginActAndPwd(Map<String, Object> map) {
        return userMapper.selectUserByLoginActAndPwd(map);
    }

//    模态窗口
    @Override
    public List<User> queryAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public int saveNewUser(User user) {
        return userMapper.insertNewUser(user);
    }
}
