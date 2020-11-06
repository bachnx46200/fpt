package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.model.Account;
import com.enao.team2.quanlynhanvien.repository.AccountRepository;
import com.enao.team2.quanlynhanvien.security.UserPrincipal;
import com.enao.team2.quanlynhanvien.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
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
            userPrincipal.setMahocsinh(account.getHocsinh().getId());
            userPrincipal.setMagiaovien(account.getGiaovien().getId());
        }
        return userPrincipal;
    }

    @Override
    public Account createUser(Account account) {
        return accountRepository.saveAndFlush(account);
    }
}
