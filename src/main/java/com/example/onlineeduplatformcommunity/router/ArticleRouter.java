package com.example.onlineeduplatformcommunity.router;

import com.example.onlineeduplatformcommunity.handler.ArticleHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class ArticleRouter {

    @Bean
    public RouterFunction<ServerResponse> articleRouter(ArticleHandler articleHandler) {
        return RouterFunctions.route()
                .GET("/articles", articleHandler::getArticleList)
                .POST("/articles", articleHandler::createArticle)
                .GET("/articles/{articleId}", articleHandler::getArticle)
                .PATCH("/articles/{articleId}", articleHandler::blockArticle)
                .build();
    }
}
