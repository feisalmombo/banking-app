package com.efetechltd.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efetechltd.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
