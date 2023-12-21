package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.enity.PlayListMovie;
import com.da.du_an.democode.repository.PlayListMovieRepository;
import com.da.du_an.democode.service.PlayListMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PlayListMovieServiceImpl implements PlayListMovieService {

    @Autowired
    private PlayListMovieRepository playListMovieRepository;

    @Override
    public List<PlayListMovie> getPlayListMovie() {
        return playListMovieRepository.findAll();
    }
}
