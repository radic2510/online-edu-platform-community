/**
 * You are strictly prohibited to copy, disclose, distribute, modify, or use this program in part
 * or as a whole without the prior written consent of Phoenix Co., Ltd.
 * Phoenix Co., Ltd., owns the intellectual property rights in and to this program.
 * <p>
 * (Copyright ⓒ 2019 Phoenix Co., Ltd. All Rights Reserved Confidential)
 */
package com.example.onlineeduplatformcommunity.repository;

import com.example.onlineeduplatformcommunity.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public interface CommentRepository extends R2dbcRepository<Comment, Long> {
    Mono<Comment> findByArticleIdAndCommentId(int articleId, int commentId);

    Flux<Comment> findByArticleId(int articleId);
}
