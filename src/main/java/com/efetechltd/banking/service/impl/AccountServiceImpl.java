package com.efetechltd.banking.service.impl;

import org.springframework.stereotype.Service;

import com.efetechltd.banking.dto.AccountDto;
import com.efetechltd.banking.entity.Account;
import com.efetechltd.banking.mapper.AccountMapper;
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
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {

        Account account = accountRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exists"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        return null;
    }

}
