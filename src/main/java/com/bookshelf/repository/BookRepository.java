package com.bookshelf.repository;

import com.bookshelf.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

    List<Book> findAllByTitle(String title);
    List<Book> findAllByAccountId(String authorId);


    @Query(value =
            "SELECT b.* FROM book_genre bg " +
            "JOIN book b ON bg.book_id = b.id " +
            "where bg.genre_id = :gId",
            nativeQuery = true)
    List<Book> findAllByGenreList(@Param("gId") String genreId);

}
