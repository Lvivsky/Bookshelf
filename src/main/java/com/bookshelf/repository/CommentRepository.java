package com.bookshelf.repository;

import com.bookshelf.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,String> {

    @Query(value = "select * from comment where book_id = :bId ", nativeQuery = true)
    List<Comment> findAllByBookId(@Param("bId") String bookId);

    List<Comment> findAllByAccountId(String accountId);

}
