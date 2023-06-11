package com.lowwall.zeomzeom.service;

import com.lowwall.zeomzeom.entity.User;
import com.lowwall.zeomzeom.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public Long saveUser(User user) {
        User save = userRepository.save(user);

        return save.getId();
    }

    @Transactional
    public void updateUser(Long userId, User param) {
        User findUser = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid userId: " + userId));
        findUser.setName(param.getName());
//        findUser.setUserId(param.getUserId());
        findUser.setPassword(param.getPassword());
    }

    public User findById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid userId: " + userId));
    }

    public Iterable<User> findUsers() {
        return userRepository.findAll();
    }
}
