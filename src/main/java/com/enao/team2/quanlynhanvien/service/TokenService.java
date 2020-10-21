package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.model.Token;

public interface TokenService {

    Token createToken(Token token);
    Token findByToken(String jwt);
}
