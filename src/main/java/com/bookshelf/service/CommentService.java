package com.bookshelf.service;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Comment;

import java.util.List;

public interface CommentService {

    void save(Comment comment);
    void remove(String id);

    Comment findCommentById(String id) throws EntityNotFoundException;

    List<Comment> findAllBookComments(String bookId);
    List<Comment> findAllCommentAccount(String accountId);

}
