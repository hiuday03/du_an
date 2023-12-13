package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.enity.Movie;
import com.da.du_an.democode.repository.MovieRepository;
import com.da.du_an.democode.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getMovie() {
        List<Movie> movie=movieRepository.findAll();
        return movie;
    }

}
