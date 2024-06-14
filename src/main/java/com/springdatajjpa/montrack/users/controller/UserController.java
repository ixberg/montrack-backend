package com.springdatajjpa.montrack.users.controller;

import com.springdatajjpa.montrack.response.Response;
import com.springdatajjpa.montrack.users.dto.RegisterRequestDto;
import com.springdatajjpa.montrack.users.dto.RegisterResponseDto;
import com.springdatajjpa.montrack.users.entity.Users;
import com.springdatajjpa.montrack.users.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile/{email}")
    public Users profile(@PathVariable String email) {
        return userService.profile(email);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequestDto req) {
        return Response.success("register success", userService.register(req));
    }
}
