package com.lowwall.zeomzeom.service;

import com.lowwall.zeomzeom.entity.Answer;
import com.lowwall.zeomzeom.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;

    @Transactional
    public void saveAnswer(Answer answer) {
        answerRepository.save(answer);
    }

    @Transactional
    public void updateAnswer(Long answerId, Answer param) {
        Answer findAnswer = answerRepository.findById(answerId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid answerId: " + answerId));
        findAnswer.setAnswerContent(param.getAnswerContent());
    }

    public Answer findOne(Long answerId) {
        return answerRepository.findById(answerId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid answerId: " + answerId));
    }

    public List<Answer> findAnswers() {
        return answerRepository.findAll();
    }
}
