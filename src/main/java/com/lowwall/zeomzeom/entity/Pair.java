package com.lowwall.zeomzeom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = PROTECTED)
public class Pair extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "pair_id")
    private Long id;

    //TODO : 기타 필드 추가
}
