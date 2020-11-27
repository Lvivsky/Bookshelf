package com.bookshelf.repository;

import com.bookshelf.model.container.FileContainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileContainerRepository extends JpaRepository<FileContainer, String> {
}
