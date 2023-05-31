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
public class User extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "pair_id")
    private Pair pair;

    private String email;
    private String password;
    private String name;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String auth;

    public User(String email, String password, String name, String birthday, String address, String phoneNumber, String auth) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.auth = auth;
    }
}
