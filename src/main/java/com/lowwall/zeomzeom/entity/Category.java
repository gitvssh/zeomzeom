package com.lowwall.zeomzeom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    private String categoryName;
}
