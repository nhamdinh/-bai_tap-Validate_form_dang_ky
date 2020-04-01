package com.userAccount.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.userAccount.model.UserAccount;

public interface UserAccountRepository extends PagingAndSortingRepository<UserAccount,Integer> {
}
