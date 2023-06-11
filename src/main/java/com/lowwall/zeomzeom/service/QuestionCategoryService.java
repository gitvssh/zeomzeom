package com.lowwall.zeomzeom.service;

import com.lowwall.zeomzeom.repository.QuestionCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class QuestionCategoryService {
    private final QuestionCategoryRepository questionCategoryRepository;


}
