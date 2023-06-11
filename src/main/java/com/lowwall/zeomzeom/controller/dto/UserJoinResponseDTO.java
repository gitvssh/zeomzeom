package com.lowwall.zeomzeom.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserJoinResponseDTO {
    private Long userId;
    private String email;
    private String name;
    private String birth;
    private String address;
    private String phoneNumber;
    private String socialLoginType;
    private LocalDateTime createdAt;
}
