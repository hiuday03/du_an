package com.da.du_an.democode.repository;


import com.da.du_an.democode.enity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(CommentRepository.NAME)
public interface CommentRepository extends JpaRepository<Comment, String> {
    public static final String NAME = "BaseCommentRepository";
}
