package com.bookshelf.repository;

import com.bookshelf.model.Account;
import com.bookshelf.model.container.PhotoContainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoContainerRepository extends JpaRepository<PhotoContainer, String> {

    PhotoContainer findByAccount(Account account);

}
