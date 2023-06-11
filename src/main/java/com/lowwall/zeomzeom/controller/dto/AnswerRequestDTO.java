package com.lowwall.zeomzeom.controller.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerRequestDTO {
    @NotEmpty(message = "질문을 찾을 수 없습니다.")
    private Long pairQuestionId;
    @NotEmpty(message = "답변을 입력해주세요.")
    private String answerText;
}
