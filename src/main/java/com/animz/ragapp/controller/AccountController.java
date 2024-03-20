package com.animz.ragapp.controller;

import com.animz.ragapp.model.Account;
import com.animz.ragapp.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Account> getAllAccounts() {
            return accountService.findAll();
    }
}
