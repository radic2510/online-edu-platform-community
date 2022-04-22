package com.example.onlineeduplatformcommunity.domain;

import java.time.LocalDateTime;

public class Comment {
    private final int commentId;
    private final int articleId;
    private final int userId;
    private final String comment;
    private boolean blockYn;
    private String blockComment;

    public Comment(int commentId, int articleId, int userId, String comment) {
        this.commentId = commentId;
        this.articleId = articleId;
        this.userId = userId;
        this.comment = comment;
        this.blockYn = false;
    }

    public int getCommentId() {
        return commentId;
    }

    public int getArticleId() {
        return articleId;
    }

    public int getUserId() {
        return userId;
    }

    public String getComment() {
        return comment;
    }

    public boolean getBlockYn() {
        return blockYn;
    }

    public void setBlockYn(boolean blockYn) {
        this.blockYn = blockYn;
    }

    public String getBlockComment() {
        return blockComment;
    }

    public void setBlockComment(String blockComment) {
        this.blockComment = blockComment;
    }
}
