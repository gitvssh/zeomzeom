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
public class PairQuestion extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "pair_question_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "pair_id")
    private Pair pair;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    private boolean viewYn;
    private boolean replyYn;
}
