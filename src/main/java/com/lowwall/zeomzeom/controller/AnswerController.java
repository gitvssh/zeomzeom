package com.lowwall.zeomzeom.controller;

import com.lowwall.zeomzeom.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/answer")
@RequiredArgsConstructor
//@Tag(name = "6. Answer", description = "Answer API")
public class AnswerController {
    private final AnswerService answerService;

    @PostMapping("/{answerId}")
    //@Operation(summary = "답변 등록", description = "2-2-2 오늘의 질문, 답변 등록")
    public String answer() {
        return "answer/answer";
    }

    @PutMapping("/{answerId}")
    //@Operation(summary = "답변 수정", description = "답변 수정")
    public String update() {
        return "answer/update";
    }

    @GetMapping("/{answerId}")
    //@Operation(summary = "답변 삭제", description = "2-3-1 오늘의 질문 답변 후\\n\" +\n2-3-1과 2-3-2의 차이는 답변조회 결과수로 구별")
    public String detail() {
        return "answer/detail";
    }

    @GetMapping("/")
    //@Operation(summary = "답변 목록 조회", description = "3 날짜별 보관함, 카테고리별 ")
    public String list() {
        return "answer/list";
    }
}
