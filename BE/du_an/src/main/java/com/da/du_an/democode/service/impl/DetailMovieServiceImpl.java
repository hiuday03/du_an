package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.common.base.PageableObject;
import com.da.du_an.democode.enity.DetailMovie;
import com.da.du_an.democode.model.request.DetailMovieRequest;
import com.da.du_an.democode.repository.DetailMovieRepository;
import com.da.du_an.democode.service.DetailMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DetailMovieServiceImpl implements DetailMovieService {

    @Autowired
    private DetailMovieRepository detailMovieRepository;

    @Override
    public PageableObject<DetailMovie> getDetailMovie(DetailMovieRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<DetailMovie> res = detailMovieRepository.findAll(pageable);
        return new PageableObject<>(res);
    }



}
