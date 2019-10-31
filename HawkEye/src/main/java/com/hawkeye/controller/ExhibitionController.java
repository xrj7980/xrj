package com.hawkeye.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hawkeye.pojo.Movie;
import com.hawkeye.service.impl.MovieRegionServiceImpl;
import com.hawkeye.service.impl.MovieServiceImpl;
import com.hawkeye.service.impl.MovieTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 展示控制器
 */
@RestController
@RequestMapping("/exhibition")
public class ExhibitionController {

    /**
     * 类型
     */
    @Autowired
    MovieTypeServiceImpl movieTypeService;

    /**
     * 区域
     */
    @Autowired
    MovieRegionServiceImpl movieRegionService;

    /**
     *电影
     */
    @Autowired
    MovieServiceImpl movieService;

    /**
     * 得到所有电影类型
     * @return
     */
    @RequestMapping("/movietype")
    public String movietype(){
        return JSON.toJSONString(movieTypeService.getMovieTypes());
    }

    /**
     * 得到所有区域
     * @return
     */
    @RequestMapping("/movieregion")
    public String movieregion(){
        return JSON.toJSONString(movieRegionService.getMovieRegions());
    }

    /**
     *
     * @param page 页数
     * @param typrId 类型Id
     * @param regionId 区域Id
     * @param release 年代
     * @return
     */
    @RequestMapping("/movie")
    public List<Movie> movie(@RequestParam(value = "page",defaultValue = "1")Integer page, Integer typrId, Integer regionId, String release){
        PageHelper.startPage(page,5);
        PageInfo<Movie> pageInfo = new PageInfo<>(movieService.getMovies(typrId,regionId,release));
        return pageInfo.getList();
    }
}
