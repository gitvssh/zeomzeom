package com.lowwall.zeomzeom.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Answer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Long id;

    private String answerContent;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "pair_question_id")
    private PairQuestion pairQuestion;

    private String userId;
}
