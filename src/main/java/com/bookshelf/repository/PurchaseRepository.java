package com.bookshelf.repository;

import com.bookshelf.model.Account;
import com.bookshelf.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, String> {

    List<Purchase> findAllByAccount(Account account);

}