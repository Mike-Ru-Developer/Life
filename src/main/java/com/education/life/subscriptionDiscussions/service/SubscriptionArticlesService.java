package com.education.life.subscriptionDiscussions.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.education.life.profile.model.User;
import com.education.life.profile.repository.UserRepository;
import com.education.life.subscriptionDiscussions.model.SubscriptionArticles;
import com.education.life.subscriptionDiscussions.repository.SubscriptionArticlesRepository;

@Service
public class SubscriptionArticlesService {
    private final SubscriptionArticlesRepository subscriptionArticlesRepository;
    private final UserRepository userRepository; // Репозиторий пользователей

    public SubscriptionArticlesService(SubscriptionArticlesRepository subscriptionArticlesRepository,
	    UserRepository userRepository) {
	this.subscriptionArticlesRepository = subscriptionArticlesRepository;
	this.userRepository = userRepository; // Инициализация репозитория пользователей
    }

    // Метод для получения подписок пользователя по его идентификатору
    public List<SubscriptionArticles> findByUser(Long userId) {
	User user = userRepository.findById(userId).orElse(null); // Получаем пользователя по ID
	if (user != null) {
	    return subscriptionArticlesRepository.findByUser(user); // Возвращаем подписки, если пользователь найден
	}
	return Collections.emptyList(); // Возвращаем пустой список, если пользователь не найден
    }
}