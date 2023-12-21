package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.enity.ViewHistory;
import com.da.du_an.democode.repository.ViewHistoryRepository;
import com.da.du_an.democode.service.ViewHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ViewHistoryServiceImpl implements ViewHistoryService {

    @Autowired
    private ViewHistoryRepository viewHistoryRepository;

    @Override
    public List<ViewHistory> getViewHistory() {
        return viewHistoryRepository.findAll();
    }
}
