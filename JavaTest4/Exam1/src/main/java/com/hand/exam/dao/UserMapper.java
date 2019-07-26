package com.hand.exam.dao;

import com.hand.exam.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@Mapper
public interface UserMapper {
    Integer selectUser(User user);

    void insertUser(User user);

    void updateUserById(@Param("id") Integer id);

    User selectUserById(@Param("id") Integer id);

    void deleteUserById(@Param("id") Integer id);
}
