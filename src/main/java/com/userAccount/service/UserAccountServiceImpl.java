package com.userAccount.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.userAccount.model.UserAccount;
import com.userAccount.repository.UserAccountRepository;

public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    private UserAccountRepository userAccountRepository;
    @Override
    public void save(UserAccount userAccount) {
        userAccountRepository.save(userAccount);
    }
}
