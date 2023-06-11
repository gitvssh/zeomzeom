package com.lowwall.zeomzeom.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequestDTO {
    private String name;
    private String birth;
    private String phoneNumber;
    private String address;
    private String email;
}
