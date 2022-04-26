package com.example.onlineeduplatformcommunity.model;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Table(value = "comment")
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Comment {

    @Id @GeneratedValue
    private int commentId;
    private int articleId;
    private int userId;
    private String comment;
    private boolean blockYn;
    private String blockComment;
}
