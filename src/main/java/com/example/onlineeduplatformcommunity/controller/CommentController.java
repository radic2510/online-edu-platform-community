package com.example.onlineeduplatformcommunity.controller;

import com.example.onlineeduplatformcommunity.handler.CommentHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class CommentController {

    @Bean
    public RouterFunction<ServerResponse> articleRouter(CommentHandler commentHandler) {
        return RouterFunctions.route()
                .GET("/comment/{articleId}", commentHandler::getComments)
                .POST("/comment/{articleId}", commentHandler::createComment)
                .PATCH("/comment/{articleId}/{commentId}", commentHandler::blockComment)
                .build();
    }
}
