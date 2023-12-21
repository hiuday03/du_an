package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.enity.Comment;
import com.da.du_an.democode.repository.CommentRepository;
import com.da.du_an.democode.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> getComment() {
        return commentRepository.findAll();
    }
}
