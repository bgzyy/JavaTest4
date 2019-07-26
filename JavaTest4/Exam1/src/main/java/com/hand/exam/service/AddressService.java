package com.hand.exam.service;

import org.apache.ibatis.annotations.Param;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
public interface AddressService {
    Integer getIdByAddress(@Param("address") String address);
}
