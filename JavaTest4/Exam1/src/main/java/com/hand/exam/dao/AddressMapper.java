package com.hand.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@Mapper
public interface AddressMapper {

    Integer selectIdByAddress(@Param("address") String address);
}