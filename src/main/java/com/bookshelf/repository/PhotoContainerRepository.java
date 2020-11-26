package com.bookshelf.repository;

import com.bookshelf.model.PhotoContainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoContainerRepository extends JpaRepository<PhotoContainer, String> {
}
