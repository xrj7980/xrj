package com.hawkeye.service.impl;

import com.github.pagehelper.PageHelper;
import com.hawkeye.mapper.MovieMapper;
import com.hawkeye.pojo.Movie;
import com.hawkeye.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieMapper movieMapper;

    @Override
    public List<Movie> getMovies(Integer typrId, Integer regionId, String release) {

        return movieMapper.getMovies(typrId,regionId,release);
    }
}
