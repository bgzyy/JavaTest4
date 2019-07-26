package com.hand.exam.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@NoArgsConstructor
@Data
@ToString
public class User {
    private Integer customerId;
    private String userName;
    private String password;
    private String email;
}