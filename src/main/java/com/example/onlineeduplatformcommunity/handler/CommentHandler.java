package com.example.onlineeduplatformcommunity.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public interface CommentHandler {

    Mono<ServerResponse> getComment(ServerRequest serverRequest);

    Mono<ServerResponse> createComment(ServerRequest serverRequest);

    Mono<ServerResponse> blockComment(ServerRequest serverRequest);

    Mono<ServerResponse> getCommentList(ServerRequest serverRequest);
}
