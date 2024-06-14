package com.springdatajjpa.montrack.users.services;

import com.springdatajjpa.montrack.users.dto.RegisterRequestDto;
import com.springdatajjpa.montrack.users.dto.RegisterResponseDto;
import com.springdatajjpa.montrack.users.entity.Users;

public interface UserService {
    RegisterResponseDto register(RegisterRequestDto user);
    Users profile(String email);
}
