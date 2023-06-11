package com.lowwall.zeomzeom.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserQueryResponseDTO {
    private Long userId;
    private String name;
    private String email;
}
