package com.example.onlineeduplatformcommunity.domain;

public class Article {
    private final int articleId;
    private final int userId;
    private final String content;
    private int blockYn;

    public Article(int commentId, int articleId, int userId, String comment) {
        this.articleId = articleId;
        this.userId = userId;
        this.content = comment;
        this.blockYn = 0;
    }

    public int getArticleId() {
        return articleId;
    }

    public int getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public int getBlockYn() {
        return blockYn;
    }

    public void setBlockYn(int blockYn) {
        this.blockYn = blockYn;
    }

}
