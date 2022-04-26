package com.example.onlineeduplatformcommunity.service;

import com.example.onlineeduplatformcommunity.model.Comment;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CommentService {
//    Mono<Comment> createComment(Comment comment);
//
    Mono<Comment> getComment(int articleId, int commentId);

    Flux<Comment> getCommentList(int articleId);
}
