package com.lowwall.zeomzeom.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AnswerResponseDTO {
    private Long answerId;
    private Long pairQuestionId;
    private Long userId;
    private String AnswerContent;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
