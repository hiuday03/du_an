package com.da.du_an.democode.repository;

import com.da.du_an.democode.enity.PlayListMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(PlayListMovieRepository.NAME)
public interface PlayListMovieRepository extends JpaRepository<PlayListMovie, String> {
    public static final String NAME = "BasePlayListMovieRepository";
}
