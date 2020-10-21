package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.model.Token;
import com.enao.team2.quanlynhanvien.repository.TokenRepository;
import com.enao.team2.quanlynhanvien.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;

public class TokenServiceImpl implements TokenService {
    @Autowired
    private TokenRepository tokenRepository;

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }
}
