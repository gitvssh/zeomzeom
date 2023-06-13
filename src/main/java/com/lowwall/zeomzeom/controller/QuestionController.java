package com.lowwall.zeomzeom.controller;

import com.lowwall.zeomzeom.controller.dto.QuestionResponseDTO;
import com.lowwall.zeomzeom.entity.Pair;
import com.lowwall.zeomzeom.entity.PairQuestion;
import com.lowwall.zeomzeom.entity.Question;
import com.lowwall.zeomzeom.service.PairQuestionService;
import com.lowwall.zeomzeom.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RequestMapping("/api/question")
@RequiredArgsConstructor
@RestController
//@Tag(name = "5. Question", description = "Question API")
public class QuestionController {
    private final QuestionService questionService;
    private final PairQuestionService pairQuestionService;

    @PostMapping("/")
    //@Operation(summary = "질문 생성 요청", description = "2-1 오늘의 질문, 요청 시 질문 생성")
    public QuestionResponseDTO question() {
        //페어 질문 생성
        Long pairQuestionId = questionService.create();
        PairQuestion pairQuestion = pairQuestionService.findById(pairQuestionId);
        Pair pair = pairQuestion.getPair();
        Question question = pairQuestion.getQuestion();

        //페어 질문 반환
        QuestionResponseDTO questionResponseDTO = new QuestionResponseDTO();
        questionResponseDTO.setPairQuestionId(pairQuestionId);
        questionResponseDTO.setPairId(pair.getId());
        questionResponseDTO.setQuestionId(question.getId());
        questionResponseDTO.setQuestion(question.getQuestion());
        questionResponseDTO.setClosingMessage(question.getClosingMessage());

        return questionResponseDTO;
    }

    @GetMapping("/")
    //@Operation(summary = "질문 목록 조회", description = "2-1 오늘의 질문, 질문 목록 조회")
    public List<Question> list() {
        //페어 질문 목록 조회
        //TODO: 페어 엔티티 DTO로 매핑하여 반환
        return questionService.findAll();
    }
}
