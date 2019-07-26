package com.hand.exam.service;

import com.hand.exam.bean.User;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
public interface UserService {

    Integer selectUser(User user);

    void addUser(User user);

    void updateUser(Integer id);

    User getUserById(Integer id);

    void deleteUserById(Integer id);
}
