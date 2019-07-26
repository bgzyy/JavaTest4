package com.hand.exam.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@NoArgsConstructor
@Data
public class User {
    private Integer customerId;
    private String userName;
    private String password;
    private String email;
    private Integer addressId;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", addressId=" + addressId +
                '}';
    }
}