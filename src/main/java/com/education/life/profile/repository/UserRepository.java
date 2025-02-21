package com.education.life.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.life.profile.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByNickname(String nickname);
}
