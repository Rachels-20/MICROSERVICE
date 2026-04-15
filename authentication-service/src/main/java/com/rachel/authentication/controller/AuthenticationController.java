package com.rachel.authentication.controller;

import com.rachel.authentication.login.LoginRequest;
import com.rachel.authentication.login.LoginResponse;
import com.rachel.authentication.register.RegisterRequest;
import com.rachel.authentication.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return authenticationService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return authenticationService.login(
                request.getUsername(),
                request.getPassword());
    }
}