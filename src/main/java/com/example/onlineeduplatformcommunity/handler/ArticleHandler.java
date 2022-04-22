package com.example.onlineeduplatformcommunity.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public interface ArticleHandler {

    Mono<ServerResponse> getArticleList(ServerRequest serverRequest);

    Mono<ServerResponse> getArticle(ServerRequest serverRequest);

    Mono<ServerResponse> createArticle(ServerRequest serverRequest);

    Mono<ServerResponse> blockArticle(ServerRequest serverRequest);
}
