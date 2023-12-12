package com.da.du_an.democode.repository;

import com.da.du_an.democode.enity.PlayListMovie;
import com.da.du_an.democode.enity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(VideoRepository.NAME)
public interface VideoRepository extends JpaRepository<Video, String> {
    public static final String NAME = "BaseVideoRepository";
}
