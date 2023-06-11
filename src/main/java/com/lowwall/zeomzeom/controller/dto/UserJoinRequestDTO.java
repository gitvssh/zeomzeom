package com.lowwall.zeomzeom.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserJoinRequestDTO {
    private String email;
    private String password;
    private String name;
    private String birth;
    private String phoneNumber;
    private String address;
    private String socialLoginType;
    private String socialLoginAccessToken;
}
