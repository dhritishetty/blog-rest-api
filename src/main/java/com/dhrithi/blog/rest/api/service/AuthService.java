package com.dhrithi.blog.rest.api.service;

import com.dhrithi.blog.rest.api.payload.LoginDto;
import com.dhrithi.blog.rest.api.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);

}
