package com.example.onlineeduplatformcommunity.service;
import com.example.onlineeduplatformcommunity.model.Article;
import com.example.onlineeduplatformcommunity.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public Flux<Article> findAll() {
        return articleRepository.findAll();
    }

}
