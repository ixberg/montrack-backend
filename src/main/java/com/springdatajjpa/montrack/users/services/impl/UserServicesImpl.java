package com.springdatajjpa.montrack.users.services.impl;

import com.springdatajjpa.montrack.users.dto.RegisterRequestDto;
import com.springdatajjpa.montrack.users.dto.RegisterResponseDto;
import com.springdatajjpa.montrack.users.entity.Users;
import com.springdatajjpa.montrack.users.repository.UserRepository;
import com.springdatajjpa.montrack.users.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserService {
    private final UserRepository userRepository;

    public UserServicesImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public RegisterResponseDto register(RegisterRequestDto req) {
        var newUser = userRepository.save(req.toEntity());
        var response = new RegisterResponseDto();
        response.setEmail(newUser.getEmail());
        response.setActiveCurrency(newUser.getActiveCurrency());
        return response;
    }

    @Override
    public Users profile(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
    }



}
