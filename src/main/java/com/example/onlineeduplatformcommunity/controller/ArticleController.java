package com.example.onlineeduplatformcommunity.controller;

import com.example.onlineeduplatformcommunity.handler.ArticleHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class ArticleController {

    @Bean
    public RouterFunction<ServerResponse> articleRouter(ArticleHandler articleHandler) {
        return RouterFunctions.route()
                .GET("/article", articleHandler::getArticleList)
                .POST("/article", articleHandler::createArticle)
                .GET("/article/{articleId}", articleHandler::getArticle)
                .PATCH("/article/{articleId}", articleHandler::blockArticle)
                .build();
    }
}
