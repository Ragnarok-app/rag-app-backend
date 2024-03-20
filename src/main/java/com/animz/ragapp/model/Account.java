package com.animz.ragapp.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
public class Account {

    @Id
    private final int accountID;
    private final String userID;
    private final String userPass;
    private final String sex;
    private final String email;

    public Account(int accountID, String userID, String userPass, String sex, String email){
        this.accountID = accountID;
        this.userID = userID;
        this.userPass = userPass;
        this.sex = sex;
        this.email = email;
    }
}
