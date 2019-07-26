package com.hand.exam.service.impl;

import com.hand.exam.bean.User;
import com.hand.exam.dao.UserMapper;
import com.hand.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer selectUser(User user) {
        return userMapper.selectUser(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(Integer id) {
        userMapper.updateUserById(id);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }
}
