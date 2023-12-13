package com.da.du_an.democode.service;

import com.da.du_an.democode.common.base.PageableObject;
import com.da.du_an.democode.enity.DetailMovie;
import com.da.du_an.democode.model.request.DetailMovieRequest;

public interface DetailMovieService {

    PageableObject<DetailMovie> getDetailMovie(DetailMovieRequest request);

}
