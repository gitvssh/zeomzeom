package com.lowwall.zeomzeom.repository;

import com.lowwall.zeomzeom.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
