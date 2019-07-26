package com.hand.exam.service.impl;

import com.hand.exam.bean.Film;
import com.hand.exam.dao.FilmMapper;
import com.hand.exam.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public List<Film> getFilmList() {
        return filmMapper.selectFilmList();
    }
}
