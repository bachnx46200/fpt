package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.model.Account;
import com.enao.team2.quanlynhanvien.security.UserPrincipal;

public interface AccountService {
    UserPrincipal findByUsername(String username);
    Account createUser(Account account);
}
