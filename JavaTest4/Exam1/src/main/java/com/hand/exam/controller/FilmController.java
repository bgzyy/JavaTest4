package com.hand.exam.controller;

import com.github.pagehelper.PageHelper;
import com.hand.exam.bean.Film;
import com.hand.exam.bean.Page;
import com.hand.exam.service.FilmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhao'yin
 * Date 2019/7/26.
 */
@RestController
public class FilmController {

    @Autowired
    private FilmService filmService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/film/list")
    public List<Film> getList(Page page) {
        PageHelper.startPage(page.getPage(), page.getPageSize(), page.getSort());
        List<Film> filmList = filmService.getFilmList();
        String order;
        if (page.getSort() == "DESC") {
            order = "降序";
        } else {
            order = "升序";
        }
        logger.info("===============查询出每页数量为" + page.getPageSize() + "的第 "  + page.getPage() + " 页数据，排序顺序为 " + order + "==================================");
        return filmList;
    }
}
