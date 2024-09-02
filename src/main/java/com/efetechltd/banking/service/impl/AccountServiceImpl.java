package com.efetechltd.banking.service.impl;

import org.springframework.stereotype.Service;

import com.efetechltd.banking.dto.AccountDto;
import com.efetechltd.banking.repository.AccountRepository;
import com.efetechltd.banking.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }

}
