package com.hand.exam.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@NoArgsConstructor
@ToString
@Data
public class Page {
    private int pageSize;
    private int page;
    private String sort = "ASC";
}