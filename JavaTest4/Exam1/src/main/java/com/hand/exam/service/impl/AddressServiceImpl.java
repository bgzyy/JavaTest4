package com.hand.exam.service.impl;

import com.hand.exam.dao.AddressMapper;
import com.hand.exam.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Integer getIdByAddress(String address) {
        return addressMapper.selectIdByAddress(address);
    }
}