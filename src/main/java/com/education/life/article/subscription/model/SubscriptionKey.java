package com.education.life.article.subscription.model;

import java.util.Objects;

public class SubscriptionKey {
    private Long user; // Идентификатор пользователя
    private Long article; // Идентификатор статьи (изменено на article)

    public SubscriptionKey() {
    }

    public SubscriptionKey(Long user, Long article) { // Измените параметр конструктора на article
	this.user = user;
	this.article = article;
    }

    public Long getUser() {
	return user;
    }

    public void setUser(Long user) {
	this.user = user;
    }

    public Long getArticle() { // Измените на getArticle
	return article;
    }

    public void setArticle(Long article) { // Измените на setArticle
	this.article = article;
    }

    @Override
    public int hashCode() {
	return Objects.hash(article, user); // Измените на article
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null || getClass() != obj.getClass())
	    return false;
	SubscriptionKey other = (SubscriptionKey) obj;
	return Objects.equals(article, other.article) && Objects.equals(user, other.user); // Измените на article
    }
}