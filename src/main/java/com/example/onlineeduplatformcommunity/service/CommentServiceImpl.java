/**
 * You are strictly prohibited to copy, disclose, distribute, modify, or use this program in part
 * or as a whole without the prior written consent of Phoenix Co., Ltd.
 * Phoenix Co., Ltd., owns the intellectual property rights in and to this program.
 * <p>
 * (Copyright ⓒ 2019 Phoenix Co., Ltd. All Rights Reserved Confidential)
 */
package com.example.onlineeduplatformcommunity.service;

import com.example.onlineeduplatformcommunity.model.Comment;
import com.example.onlineeduplatformcommunity.repository.CommentRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

//    @Override
//    public Mono<Comment> createComment(Comment comment) {
//        return Mono.just(this.commentRepository.save(comment));
//    }
//
    @Override
    public Mono<Comment> getComment(int articleId, int commentId) {
        return null;
        //return this.commentRepository.findByArticleIdAndCommentId(articleId, commentId);
    }

    @Override
    public Flux<Comment> getCommentList(int articleId) {
        return null;
        //return this.commentRepository.findByArticleId(articleId);
    }
}
