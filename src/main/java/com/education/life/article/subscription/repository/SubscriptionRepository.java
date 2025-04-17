package com.education.life.article.subscription.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.life.article.subscription.model.Subscription;
import com.education.life.article.subscription.model.SubscriptionKey;
import com.education.life.user.authentication.model.User;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, SubscriptionKey> {

    List<Subscription> findByUser(User user);

}
