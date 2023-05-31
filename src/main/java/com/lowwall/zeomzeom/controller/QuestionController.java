package com.lowwall.zeomzeom.controller;

import com.lowwall.zeomzeom.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/question")
@RequiredArgsConstructor
//@Tag(name = "5. Question", description = "Question API")
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping("/")
    //@Operation(summary = "질문 생성 요청", description = "2-1 오늘의 질문, 요청 시 질문 생성")
    public String question() {
        return "question/question";
    }

    @GetMapping("/")
    //@Operation(summary = "질문 목록 조회", description = "2-1 오늘의 질문, 질문 목록 조회")
    public String list() {
        return "question/list";
    }
}
