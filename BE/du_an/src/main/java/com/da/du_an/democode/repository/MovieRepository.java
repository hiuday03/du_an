package com.da.du_an.democode.repository;

import com.da.du_an.democode.enity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(MovieRepository.NAME)
public interface MovieRepository extends JpaRepository<Movie, String> {
    public static final String NAME = "BaseMovieRepositoviery";
}
