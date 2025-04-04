package com.education.life.subscriptionDiscussions.model;

import java.util.Objects;

public class SubscriptionId {
    private Long user; // Идентификатор пользователя
    private Long article; // Идентификатор статьи (изменено на article)

    public SubscriptionId() {
    }

    public SubscriptionId(Long user, Long article) { // Измените параметр конструктора на article
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
	SubscriptionId other = (SubscriptionId) obj;
	return Objects.equals(article, other.article) && Objects.equals(user, other.user); // Измените на article
    }
}