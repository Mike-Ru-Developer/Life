package com.education.life.articles.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "discussions", schema = "user_accounts")
public class ModelArticle {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

    public ModelArticle() {
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getContext() {
	return content;
    }

    public void setContext(String content) {
	this.content = content;
    }

    @Override
    public String toString() {
	return title;
    }

}
