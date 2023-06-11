package com.lowwall.zeomzeom.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionResponseDTO {
    private Long pairQuestionId;
    private Long questionId;
    private Long pairId;
    private String question;
    private String closingMessage;
}
