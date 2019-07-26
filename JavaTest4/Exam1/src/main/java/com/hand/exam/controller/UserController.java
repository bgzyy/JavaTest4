package com.hand.exam.controller;

import com.hand.exam.bean.User;
import com.hand.exam.service.AddressService;
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
    @Autowired
    private AddressService addressService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/user/login")
    public Integer selectUser(User user) {
        Integer count = userService.selectUser(user);
        logger.info("====================== userName 为 " + user.getUserName() + " 的用户登录成功" + "======================");
        return count;
    }

    @PostMapping("/user/add")
    public Integer addUser(User user, @RequestParam("address") String address) {
        Integer addressId = addressService.getIdByAddress(address);
        if (addressId != null) {
            user.setAddressId(addressId);
            userService.addUser(user);
            logger.info("====================== 添加了 username 为 " + user.getUserName() + " 的用户======================");
            return user.getCustomerId();
        } else {
            return 0;
        }
    }

    @PutMapping("/user/update/{id}")
    public User updateUser(@PathVariable("id") Integer id) {
        User user1 = userService.getUserById(id);
        logger.info("====================== id 为 " + id + " 的用户更新前信息为:" + user1.toString() + "======================");
        userService.updateUser(id);
        User user2 = userService.getUserById(id);
        logger.info("====================== 更新了用户 Id 为 " + id + " 的 first_name 为" + user2.getUserName() + ", last_name 为" + user2.getPassword() + ", email 为 " + user2.getEmail() + "======================");
        logger.info("====================== id 为 " + id + " 的用户更新后信息为: " + user2.toString() + " ======================");
        return user2;
    }

    @DeleteMapping("/user/delete/{id}")
    public Integer deleteUserById(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
        logger.info("====================== 删除了 Id 为 " + id + " 的用户信息 ======================");
        return id;
    }
}