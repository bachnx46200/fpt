package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.model.Account;
import com.enao.team2.quanlynhanvien.repository.AccountRepository;
import com.enao.team2.quanlynhanvien.security.UserPrincipal;
import com.enao.team2.quanlynhanvien.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class AccountServiceImpl implements AccountService {
@Autowired
private AccountRepository accountRepository;


    @Override
    public UserPrincipal findByUsername(String username) {
        Account account = accountRepository.findByUsername(username);
        UserPrincipal userPrincipal = new UserPrincipal();
        if (null != account) {
            Set<String> authorities = new HashSet<>();
            authorities.add(account.getRoles());
            userPrincipal.setUserId(account.getStt());
            userPrincipal.setUsername(account.getEmail());
            userPrincipal.setPassword(account.getPass());
            userPrincipal.setAuthorities(authorities);
            userPrincipal.setMahocsinh(account.getMahocsinh());
            userPrincipal.setMagiaovien(account.getMagiaovien());
        }
        return userPrincipal;
    }

    @Override
    public Account createUser(Account account) {
        return accountRepository.saveAndFlush(account);
    }
}
