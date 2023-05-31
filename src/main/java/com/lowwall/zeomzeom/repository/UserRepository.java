package com.lowwall.zeomzeom.repository;

import com.lowwall.zeomzeom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, java.lang.Long> {
}
