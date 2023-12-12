package com.da.du_an.democode.repository;

import com.da.du_an.democode.enity.ViewHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(ViewHistoryRepository.NAME)
public interface ViewHistoryRepository extends JpaRepository<ViewHistory, String> {
    public static final String NAME = "BaseViewHistoryRepository";
}
