package com.education.life.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.life.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByNickname(String nickname);
}
