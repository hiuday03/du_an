package com.da.du_an.democode.controller;


import com.da.du_an.democode.common.base.ResponseObject;
import com.da.du_an.democode.model.request.DetailMovieRequest;
import com.da.du_an.democode.service.DetailMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/detail-movie")
public class DetailMovieController {

    @Autowired
    private DetailMovieService detailMovieService;

    @GetMapping()
    public ResponseObject getDetailMovie(final DetailMovieRequest detailMovieRequest) {
        return new ResponseObject(detailMovieService.getDetailMovie(detailMovieRequest));
    }




}
