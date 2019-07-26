package com.hand.exam.controller;

import com.hand.exam.bean.User;
import com.hand.exam.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/user/login")
    public Integer selectUser(User user) {
        Integer count = userService.selectUser(user);
        logger.info("=================== " + user.getUserName() + " 登录成功");
        return count;
    }

    @PostMapping("/user/add")
    public Integer addUser(User user) {
        userService.addUser(user);
        logger.info("================= username：" + user.getUserName() + " 的用户信息添加成功==========================");
        return user.getCustomerId();
    }

    @PutMapping("/user/update/{id}")
    public User updateUser(@PathVariable("id") Integer id) {
        userService.updateUser(id);
        User user = userService.getUserById(id);
        logger.info("======================更新了用户 Id 为 " + id + " 的 first_name 为" + user.getUserName() + ", last_name 为" + user.getPassword() + ", email 为 " + user.getEmail() + "===========================");
        return user;
    }

    @DeleteMapping("/user/delete/{id}")
    public Integer deleteUserById(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
        logger.info("==========删除了 Id 为 " + id + " 的用户信息================");
        return id;
    }
}