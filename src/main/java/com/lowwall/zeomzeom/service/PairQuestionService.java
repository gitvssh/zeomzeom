package com.lowwall.zeomzeom.service;

import com.lowwall.zeomzeom.entity.PairQuestion;
import com.lowwall.zeomzeom.repository.PairQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PairQuestionService {
    private final PairQuestionRepository pairQuestionRepository;

    @Transactional
    public void savePairQuestion(PairQuestion pairQuestion) {
        pairQuestionRepository.save(pairQuestion);
    }

    @Transactional
    public void updatePairQuestion(Long pairQuestionId, PairQuestion param) {
        PairQuestion findPairQuestion = pairQuestionRepository.findById(pairQuestionId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid pairQuestionId: " + pairQuestionId));
        findPairQuestion.setQuestion(param.getQuestion());
//        findPairQuestion.setAnswer(param.getAnswer());
    }

    public PairQuestion findById(Long pairQuestionId) {
        return pairQuestionRepository.findById(pairQuestionId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid pairQuestionId: " + pairQuestionId));
    }

}
