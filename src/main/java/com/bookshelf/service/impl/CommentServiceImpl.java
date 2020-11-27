package com.bookshelf.service.impl;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Comment;
import com.bookshelf.repository.CommentRepository;
import com.bookshelf.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository repository;

    CommentServiceImpl(@Autowired CommentRepository commentRepository) {
        this.repository = commentRepository;
    }

    @Override
    public void save(Comment comment) {
        repository.save(comment);
    }

    @Override
    public void remove(String id) {
        if (repository.existsById(id))
            repository.deleteById(id);
    }

    @Override
    public Comment findCommentById(String id) throws EntityNotFoundException {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Comment> findAllBookComments(String bookId) {
        return repository.findAllByBookId(bookId);
    }

    @Override
    public List<Comment> findAllCommentAccount(String accountId) {
        return repository.findAllByAccountId(accountId);
    }


}
