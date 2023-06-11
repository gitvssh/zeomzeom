package com.lowwall.zeomzeom.controller;

import com.lowwall.zeomzeom.controller.dto.*;
import com.lowwall.zeomzeom.entity.User;
import com.lowwall.zeomzeom.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/user")
@RequiredArgsConstructor
//@Tag(name = "1. User", description = "User API")
public class UserController {
    private final UserService userService;

    @PostMapping("/join")
    //@Operation(summary = "회원가입", description = "1-1 가입, 사용자 정보 등록")
    public UserJoinResponseDTO join(UserJoinRequestDTO userJoinRequestDTO) {
        //회원가입 여부 확인(존재x)

        //회원 가입
        User user = new User();
        user.setName(userJoinRequestDTO.getName());
//        user.setUserId(userJoinRequestDTO.getUserId());
        user.setPassword(userJoinRequestDTO.getPassword());

        Long aLong = userService.saveUser(user);

        User byId = userService.findById(aLong);
        UserJoinResponseDTO userJoinResponseDTO = new UserJoinResponseDTO();
        userJoinResponseDTO.setUserId(byId.getId());
        userJoinResponseDTO.setName(byId.getName());
        //회원 정보 반환
        return userJoinResponseDTO;
    }

    @GetMapping("/login")
    //@Operation(summary = "로그인", description = "미사용 API")
    public String login() {
        return "user/login";
    }

    @GetMapping("/logout")
    //@Operation(summary = "로그아웃", description = "미사용 API")
    public String logout() {
        return "user/logout";
    }

    @GetMapping("{userId}")
    //@Operation(summary = "사용자 정보 조회", description = "1-2 SNS 로그인, 사용자 정보를 조회한다")
    public UserQueryResponseDTO mypage(@PathVariable Long userId) {
        User byId = userService.findById(userId);
        //회원 정보 조회, 존재여부 (o)

        UserQueryResponseDTO userResponseDTO = new UserQueryResponseDTO();
        userResponseDTO.setUserId(byId.getId());
        userResponseDTO.setName(byId.getName());
        userResponseDTO.setEmail(byId.getEmail());

        //회원정보 반환
        return userResponseDTO;
    }

    @PostMapping("{userId}")
    //@Operation(summary = "사용자 정보 수정", description = "4-1 프로필 설정, 사용자 정보를 수정한다")
    public UserUpdateResponseDTO update(@PathVariable Long userId, UserUpdateRequestDTO userJoinRequestDTO) {
        User byId = userService.findById(userId);
        //회원정보 조회, 존재여부(o)

        //회원정보 수정
        UserUpdateResponseDTO userUpdateResponseDTO = new UserUpdateResponseDTO();
        userUpdateResponseDTO.setName(userJoinRequestDTO.getName());
        userUpdateResponseDTO.setEmail(userJoinRequestDTO.getEmail());

        //수정된 회원정보 반환
        return userUpdateResponseDTO;
    }
}
