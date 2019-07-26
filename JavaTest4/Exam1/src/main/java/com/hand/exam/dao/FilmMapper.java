package com.hand.exam.dao;

import com.hand.exam.bean.Film;
import com.hand.exam.bean.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@Mapper
public interface FilmMapper {

    List<Film> selectFilmList();
}