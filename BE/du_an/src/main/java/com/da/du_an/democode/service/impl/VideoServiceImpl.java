package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.enity.Video;
import com.da.du_an.democode.repository.VideoRepository;
import com.da.du_an.democode.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public List<Video> getVideo() {
        return videoRepository.findAll();
    }
}
