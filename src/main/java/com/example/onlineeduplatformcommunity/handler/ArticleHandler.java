package com.example.onlineeduplatformcommunity.handler;

import com.example.onlineeduplatformcommunity.dto.ArticleCreateRequest;
import com.example.onlineeduplatformcommunity.model.Article;
import com.example.onlineeduplatformcommunity.repository.ArticleRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.sql.Timestamp;
import java.util.Objects;

@Component
public class ArticleHandler {
    private ArticleRepository articleRepository;
    ArticleHandler(ArticleRepository repository)
    {
        this.articleRepository = repository;
    }
    public Mono<ServerResponse> getArticleList(ServerRequest serverRequest)
    {
        Flux<Article> articles = this.articleRepository.findAll()
                .filter(article -> article.getBlockYn() == false);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(articles, Article.class);
    }

    public Mono<ServerResponse> getArticle(ServerRequest serverRequest)
    {
        Long articleId = Long.parseLong(serverRequest.pathVariable("articleId"));
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();
        Mono<Article> articleMono = this.articleRepository.findById(articleId)
                .filter(article -> article.getBlockYn() == false);
        return articleMono
                .flatMap(article -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(Mono.just(article), Article.class))
                .switchIfEmpty(notFound);
    }

    public Mono<ServerResponse> createArticle(ServerRequest serverRequest)
    {
        Mono<Article> articleMono = serverRequest.bodyToMono(Article.class)
                .onErrorResume(throwable -> {
                    System.out.println(throwable.getMessage());
                    return Mono.error(new RuntimeException(throwable));
                });;

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(
                articleMono.flatMap(this.articleRepository::save),Article.class);
    }

    public Mono<ServerResponse> blockArticle(ServerRequest serverRequest)
    {
        Long articleId = Long.parseLong(serverRequest.pathVariable("articleId"));
        Mono<Article> articleMono = this.articleRepository.findById(articleId)
                .flatMap(x -> {
                    return Mono.just(new Article(articleId, x.getUserId(), x.getTitle(),x.getContent(), true, x.getCreatedAt(), new Timestamp(System.currentTimeMillis())));
                });

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(
                articleMono.flatMap(this.articleRepository::save),Article.class);
    }
}
