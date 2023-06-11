package com.lowwall.zeomzeom.controller;

import com.lowwall.zeomzeom.controller.dto.AnswerRequestDTO;
import com.lowwall.zeomzeom.controller.dto.AnswerResponseDTO;
import com.lowwall.zeomzeom.entity.Answer;
import com.lowwall.zeomzeom.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/answer")
@RequiredArgsConstructor
//@Tag(name = "6. Answer", description = "Answer API")
public class AnswerController {
    private final AnswerService answerService;

    @PostMapping("/{answerId}")
    //@Operation(summary = "답변 등록", description = "2-2-2 오늘의 질문, 답변 등록")
    public AnswerResponseDTO answer(@PathVariable Long answerId, AnswerRequestDTO answerRequestDTO) {
        //답변 조회, 존재여부 확인, 답변 등록 여부확인(x)
        Answer one = answerService.findOne(answerId);
        //답변 등록
        one.setAnswerContent(answerRequestDTO.getAnswerText());

        answerService.updateAnswer(answerId, one);

        AnswerResponseDTO answerResponseDTO = new AnswerResponseDTO();
        answerResponseDTO.setAnswerId(one.getId());
        answerResponseDTO.setPairQuestionId(answerRequestDTO.getPairQuestionId());
        answerResponseDTO.setAnswerContent(one.getAnswerContent());
        answerResponseDTO.setCreatedAt(one.getCreatedDate());
        answerResponseDTO.setUpdatedAt(one.getLastModifiedDate());
        //답변 결과 조회 반환
        return answerResponseDTO;
    }

    @PutMapping("/{answerId}")
    //@Operation(summary = "답변 수정", description = "답변 수정")
    public String update() {
        //답변 조회, 존재여부 확인, 답변 등록 여부 확인(o)
        //답변 수정
        //답변 수정 결과 조회 반환
        return "answer/update";
    }

    @GetMapping("/{answerId}")
    //@Operation(summary = "답변 삭제", description = "2-3-1 오늘의 질문 답변 후\\n\" +\n2-3-1과 2-3-2의 차이는 답변조회 결과수로 구별")
    public String detail() {
        //답변 조회, 존재여부 확인
        //답변 삭제
        //답변 삭제 결과 조회 반환
        return "answer/detail";
    }

    @GetMapping("/")
    //@Operation(summary = "답변 목록 조회", description = "3 날짜별 보관함, 카테고리별 ")
    public String list() {
        //답변 전체 조회 반환
        return "answer/list";
    }
}
