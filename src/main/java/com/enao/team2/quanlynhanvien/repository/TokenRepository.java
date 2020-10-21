package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
