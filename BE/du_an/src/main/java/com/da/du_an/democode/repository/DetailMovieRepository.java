package com.da.du_an.democode.repository;

import com.da.du_an.democode.enity.DetailMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(DetailMovieRepository.NAME)
public interface DetailMovieRepository extends JpaRepository<DetailMovie, String> {
    public static final String NAME = "BaseDetailMovieRepository";
}
