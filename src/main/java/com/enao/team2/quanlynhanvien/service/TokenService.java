package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.model.Token;
import org.springframework.stereotype.Service;

public interface TokenService {

    Token createToken(Token token);
    Token findByToken(String jwt);
}
