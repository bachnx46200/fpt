package com.enao.team2.quanlynhanvien.controller;


import com.enao.team2.quanlynhanvien.model.Account;
import com.enao.team2.quanlynhanvien.model.Token;
import com.enao.team2.quanlynhanvien.security.JwtUtil;
import com.enao.team2.quanlynhanvien.security.UserPrincipal;
import com.enao.team2.quanlynhanvien.service.AccountService;
import com.enao.team2.quanlynhanvien.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AccountApi {
        @Autowired
        private AccountService accountService;

        @Autowired
        private TokenService tokenService;

    @Autowired
    private JwtUtil jwtUtil;
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Account account) {
        UserPrincipal userPrincipal = accountService.findByUsername(account.getEmail());
        if (null == account || !new BCryptPasswordEncoder().matches(account.getPass(), userPrincipal.getPassword())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("tài khoản hoặc mật khẩu không chính xác");
        }
        Token token = new Token();
        token.setToken(jwtUtil.generateToken(userPrincipal));
        token.setTokenExpDate(jwtUtil.generateExpirationDate());
        token.setCreatedBy(userPrincipal.getUserId());
        token.setRoles(userPrincipal.getRoles());
        tokenService.createToken(token);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/register")
    public Account register(@RequestBody Account account) {
        account.setPass(new BCryptPasswordEncoder().encode(account.getPass()));
        return accountService.createUser(account);
    }
}
