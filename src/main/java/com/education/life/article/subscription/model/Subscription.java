package com.education.life.article.subscription.model;

import com.education.life.article.generalList.model.Article;
import com.education.life.user.authentication.model.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "subscriptions_users_to_articles", schema = "data_users")
@IdClass(SubscriptionKey.class)
public class Subscription {
    @Id
    @ManyToOne // Указываем связь с сущностью User
    @JoinColumn(name = "user_id") // Имя колонки в базе данных
    private User user; // Объект пользователя

    @Id
    @ManyToOne // Если articles также является ссылкой на другую сущность (например, Article)
    @JoinColumn(name = "article_id") // Имя колонки в базе данных для статьи
    private Article article; // Объект статьи

    public Subscription() {
    }

    public Subscription(User user, Article article) { // Измените параметр конструктора
	this.user = user;
	this.article = article;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public Article getArticle() {
	return article;
    }

    public void setArticle(Article article) {
	this.article = article;
    }

    @Override
    public String toString() {
	return article.getTitle();
    }

}