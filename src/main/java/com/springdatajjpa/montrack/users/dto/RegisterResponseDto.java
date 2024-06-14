package com.springdatajjpa.montrack.users.dto;

import lombok.Data;

@Data
public class RegisterResponseDto {
    private String email;
    private int activeCurrency;
}
