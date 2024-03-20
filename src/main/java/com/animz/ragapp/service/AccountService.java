package com.animz.ragapp.service;

import com.animz.ragapp.model.Account;
import com.animz.ragapp.repository.AccountRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public Flux<Account> findAll(){
        return accountRepository.findAll();
    }
}
