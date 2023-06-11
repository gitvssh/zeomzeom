package com.lowwall.zeomzeom.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserUpdateResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String role;
    private String provider;
    private String providerId;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
}
