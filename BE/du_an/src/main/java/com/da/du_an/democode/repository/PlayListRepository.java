package com.da.du_an.democode.repository;


import com.da.du_an.democode.enity.PlayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(PlayListRepository.NAME)
public interface PlayListRepository extends JpaRepository<PlayList, String> {
    public static final String NAME = "BasePlayListRepository";
}
