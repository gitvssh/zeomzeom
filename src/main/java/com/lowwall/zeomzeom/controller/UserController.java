package com.lowwall.zeomzeom.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/user")
@RequiredArgsConstructor
//@Tag(name = "1. User", description = "User API")
public class UserController {
    @PostMapping("/join")
    //@Operation(summary = "회원가입", description = "1-1 가입, 사용자 정보 등록")
    public String join() {
        return "user/join";
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
    public String mypage() {
        return "user/mypage";
    }

    @PostMapping("{userId}")
    //@Operation(summary = "사용자 정보 수정", description = "4-1 프로필 설정, 사용자 정보를 수정한다")
    public String update() {
        return "user/update";
    }
}
