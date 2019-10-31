package com.hawkeye.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hawkeye.pojo.Movie;
import com.hawkeye.service.impl.MovieRegionServiceImpl;
import com.hawkeye.service.impl.MovieServiceImpl;
import com.hawkeye.service.impl.MovieTypeServiceImpl;
import com.hawkeye.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * 展示控制器
 */
@Controller
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
    @ResponseBody
    public String movietype(){
        return JSON.toJSONString(movieTypeService.getMovieTypes());
    }

    /**
     * 得到所有区域
     * @return
     */
    @RequestMapping("/movieregion")
    @ResponseBody
    public String movieregion(){
        return JSON.toJSONString(movieRegionService.getMovieRegions());
    }

    /**
     * 得到所有电影
     * @return
     */
    @RequestMapping("/movie")
    @ResponseBody
    public List<Movie> movie(Map<String,Object> map,@RequestParam(value = "page",defaultValue = "1")Integer page, Integer typrId, Integer regionId, String release){
        PageHelper.startPage(page,5);
        PageInfo<Movie> pageInfo = new PageInfo<>(movieService.getMovies(typrId,regionId,release));
        return pageInfo.getList();
    }
}
