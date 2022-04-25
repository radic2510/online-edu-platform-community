package com.example.onlineeduplatformcommunity.router;

import com.example.onlineeduplatformcommunity.handler.CommentHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class CommentRouter {

    @Bean
    public RouterFunction<ServerResponse> commentRouter(CommentHandler commentHandler) {
        return RouterFunctions.route()
                .POST("/articles/{articleId}", commentHandler::createComment)
                .GET("/articles/{articleId}/comments", commentHandler::getCommentList)
                .GET("/articles/{articleId}/comments/{commentId}", commentHandler::getComment)
                .PATCH("/articles/{articleId}/comments/{commentId}", commentHandler::blockComment)
                .build();
    }
}
