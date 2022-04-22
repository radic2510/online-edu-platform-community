package com.example.onlineeduplatformcommunity.domain;

public class Article {
    private final int articleId;
    private final int userId;
    private final String title;
    private final String content;
    private boolean blockYn;

    public Article(int articleId, int userId, String title, String content) {
        this.articleId = articleId;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.blockYn = false;
    }

    public int getArticleId() {
        return articleId;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean getBlockYn() {
        return blockYn;
    }

    public void setBlockYn(boolean blockYn) {
        this.blockYn = blockYn;
    }

}
