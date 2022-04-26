package com.example.onlineeduplatformcommunity.repository;

import com.example.onlineeduplatformcommunity.model.Article;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ArticleRepository extends ReactiveCrudRepository<Article, Long> {
}