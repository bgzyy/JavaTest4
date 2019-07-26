package com.hand.exam.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@Data
@NoArgsConstructor
@ToString
public class Film {
    private String title;
    private String description;
    private String releaseYear;
    private String SpecialFeatures;
}