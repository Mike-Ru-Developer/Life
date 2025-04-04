package com.education.life.subscriptionDiscussions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.life.profile.model.User;
import com.education.life.subscriptionDiscussions.model.SubscriptionArticles;
import com.education.life.subscriptionDiscussions.model.SubscriptionId;

@Repository
public interface SubscriptionArticlesRepository extends JpaRepository<SubscriptionArticles, SubscriptionId> {

    List<SubscriptionArticles> findByUser(User user);

}
