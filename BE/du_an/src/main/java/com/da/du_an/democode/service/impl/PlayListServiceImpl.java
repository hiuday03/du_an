package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.enity.PlayList;
import com.da.du_an.democode.repository.PlayListRepository;
import com.da.du_an.democode.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PlayListServiceImpl implements PlayListService {

    @Autowired
    private PlayListRepository playListRepository;

    @Override
    public List<PlayList> getPlayList() {
        return playListRepository.findAll();
    }
}
