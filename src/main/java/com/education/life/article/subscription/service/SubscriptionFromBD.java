package com.education.life.article.subscription.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.education.life.article.subscription.model.Subscription;
import com.education.life.article.subscription.repository.SubscriptionRepository;
import com.education.life.user.authentication.model.User;
import com.education.life.user.authentication.repository.UserRepository;

@Service
public class SubscriptionFromBD {
    private final SubscriptionRepository subscriptionArticlesRepository;
    private final UserRepository userRepository; // Репозиторий пользователей

    public SubscriptionFromBD(SubscriptionRepository subscriptionArticlesRepository,
	    UserRepository userRepository) {
	this.subscriptionArticlesRepository = subscriptionArticlesRepository;
	this.userRepository = userRepository; // Инициализация репозитория пользователей
    }

    // Метод для получения подписок пользователя по его идентификатору
    public List<Subscription> findByUser(Long userId) {
	User user = userRepository.findById(userId).orElse(null); // Получаем пользователя по ID
	if (user != null) {
	    return subscriptionArticlesRepository.findByUser(user); // Возвращаем подписки, если пользователь найден
	}
	return Collections.emptyList(); // Возвращаем пустой список, если пользователь не найден
    }
}