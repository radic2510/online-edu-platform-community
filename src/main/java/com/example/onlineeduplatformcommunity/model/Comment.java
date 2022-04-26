package com.example.onlineeduplatformcommunity.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "comment")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Comment {

    @Id
    private Long commentId;
    private Long articleId;
    private Long userId;
    private String content;
    private boolean blockYn;

    public Comment(Long userId, String content)
    {
        this.userId = userId;
        this.content = content;
    }

    public Comment(Long articleId, Long userId, String content)
    {
        this.articleId = articleId;
        this.userId = userId;
        this.content = content;
    }
}
