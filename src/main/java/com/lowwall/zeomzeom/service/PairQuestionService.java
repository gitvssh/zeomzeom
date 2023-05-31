package com.lowwall.zeomzeom.service;

import com.lowwall.zeomzeom.repository.PairQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PairQuestionService {
    private final PairQuestionRepository pairQuestionRepository;
}
