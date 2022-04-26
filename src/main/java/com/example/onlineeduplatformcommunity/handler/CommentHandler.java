package com.example.onlineeduplatformcommunity.handler;

import com.example.onlineeduplatformcommunity.model.Comment;
import com.example.onlineeduplatformcommunity.service.CommentService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CommentHandler {
    private CommentService commentService;

    public CommentHandler(CommentService commentService) {
        this.commentService = commentService;
    }

    public Mono<ServerResponse> createComment(ServerRequest serverRequest) {
        int articleId = Integer.parseInt(serverRequest.pathVariable("articleId"));
        Mono<Comment> commentMono = serverRequest.bodyToMono(Comment.class);

//         Mono<Comment> responseCommentMono = commentMono.flatMap(comment -> {
//            return commentService.createComment(comment);
//        });

//        return ServerResponse.ok()
//                            .contentType(MediaType.APPLICATION_JSON)
//                            .body(responseCommentMono, Comment.class);
        return null;
    }

    public Mono<ServerResponse> getComment(ServerRequest serverRequest) {
        int articleId = Integer.parseInt(serverRequest.pathVariable("articleId"));
        int commentId = Integer.parseInt(serverRequest.pathVariable("commentId"));

        Mono<Comment> responseComment = commentService.getComment(articleId, commentId);

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(responseComment, Comment.class);
    }

    //    Mono<ServerResponse> blockComment(ServerRequest serverRequest);
//
    public Mono<ServerResponse> getCommentList(ServerRequest serverRequest) {
        int articleId = Integer.parseInt(serverRequest.pathVariable("articleId"));

        Flux<Comment> articleFlux = commentService.getCommentList(articleId);

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(articleFlux, Comment.class);
    }
}

