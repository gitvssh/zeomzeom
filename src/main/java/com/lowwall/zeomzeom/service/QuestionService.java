package com.lowwall.zeomzeom.service;

import com.lowwall.zeomzeom.entity.Question;
import com.lowwall.zeomzeom.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    @Transactional
    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }

    @Transactional
    public void updateQuestion(Long questionId, Question param) {
        Question findQuestion = questionRepository.findById(questionId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid questionId: " + questionId));
        findQuestion.setRatingCount(param.getRatingCount());
        findQuestion.setRatingSum(param.getRatingSum());
    }

    public Question findOne(Long questionId) {
        return questionRepository.findById(questionId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid questionId: " + questionId));
    }

    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public Long create() {

        return 1L;
    }
}
