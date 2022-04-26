package com.example.onlineeduplatformcommunity.handler;

import com.example.onlineeduplatformcommunity.model.Article;
import com.example.onlineeduplatformcommunity.model.Comment;
import com.example.onlineeduplatformcommunity.repository.ArticleRepository;
import com.example.onlineeduplatformcommunity.repository.CommentRepository;
import com.example.onlineeduplatformcommunity.service.CommentService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.sql.Timestamp;

@Component
public class CommentHandler {

    private CommentRepository commentRepository;
    public CommentHandler(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Mono<ServerResponse> createComment(ServerRequest serverRequest) {
        Long articleId = Long.parseLong(serverRequest.pathVariable("articleId"));
        Mono<Comment> commentMono = serverRequest.bodyToMono(Comment.class)
                .onErrorResume(throwable -> {
                    System.out.println(throwable.getMessage());
                    return Mono.error(new RuntimeException(throwable));
                })
                .flatMap(x-> Mono.just(new Comment(articleId,x.getUserId(), x.getContent())));


        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(
                commentMono.flatMap(this.commentRepository::save),Comment.class);
    }

    public Mono<ServerResponse> getCommentList(ServerRequest serverRequest) {

        Long articleId = Long.parseLong(serverRequest.pathVariable("articleId"));
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();
        Flux<Comment> commentMono = this.commentRepository.findByArticleId(articleId)
                .filter(comment -> comment.isBlockYn() == false);

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(commentMono, Comment.class);

    }
    public Mono<ServerResponse> blockComment(ServerRequest serverRequest)
    {
        Long commentId = Long.parseLong(serverRequest.pathVariable("commentId"));
        Mono<Comment> commentMono = this.commentRepository.findById(commentId)
                .flatMap(x -> {
                    return Mono.just(new Comment(x.getCommentId(),x.getArticleId(),x.getUserId(), x.getContent(), true));
                });

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(
                commentMono.flatMap(this.commentRepository::save),Comment.class);
    }
}

