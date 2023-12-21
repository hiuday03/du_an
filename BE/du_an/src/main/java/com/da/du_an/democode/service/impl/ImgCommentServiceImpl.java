package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.enity.ImgComment;
import com.da.du_an.democode.repository.ImgCommentRepository;
import com.da.du_an.democode.service.ImgCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ImgCommentServiceImpl implements ImgCommentService {

    @Autowired
    private ImgCommentRepository imgCommentRepository;

    @Override
    public List<ImgComment> getImgComment() {
        return imgCommentRepository.findAll();
    }
}
