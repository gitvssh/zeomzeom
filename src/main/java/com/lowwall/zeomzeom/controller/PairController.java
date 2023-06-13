package com.lowwall.zeomzeom.controller;

import com.lowwall.zeomzeom.service.PairService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pair")
@RequiredArgsConstructor
//@Tag(name = "3. Pair", description = "Pair API")
public class PairController {
    private final PairService pairService;

    @PostMapping("/")
    //@Operation(summary = "페어 신청 보내기", description = "페어테이블에 페어정보 등록 및 페어코드 생성, 반환")
    public String pair() {
        return "pair/pair";
    }

    @GetMapping("/list")
    //@Operation(summary = "페어 신청 목록 조회", description = "페어테이블에 등록된 페어정보 목록 조회")
    public String list() {
        return "pair/list";
    }

    @GetMapping("/{pairId}")
    //@Operation(summary = "페어 신청 삭제", description = "페어테이블에 등록된 페어정보 삭제")
    public String detail() {
        return "pair/detail";
    }
}
