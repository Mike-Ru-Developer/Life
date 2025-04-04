package com.education.life.subscriptionDiscussions.model;
import com.education.life.articles.model.ModelArticle;
import com.education.life.profile.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_discussions", schema = "user_accounts")
@IdClass(SubscriptionId.class)
public class SubscriptionArticles {
    @Id
    @ManyToOne // Указываем связь с сущностью User
    @JoinColumn(name = "user_id") // Имя колонки в базе данных
    private User user; // Объект пользователя

    @Id
    @ManyToOne // Если articles также является ссылкой на другую сущность (например, Article)
    @JoinColumn(name = "discussion_id") // Имя колонки в базе данных для статьи
    private ModelArticle article; // Объект статьи

    public SubscriptionArticles() {
    }

    public SubscriptionArticles(User user, ModelArticle article) { // Измените параметр конструктора
	this.user = user;
	this.article = article;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public ModelArticle getArticle() {
	return article;
    }

    public void setArticle(ModelArticle article) {
	this.article = article;
    }
}