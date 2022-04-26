package com.example.onlineeduplatformcommunity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Article {

    @Id
    private Long articleId;
    private int userId;
    private String title;
    private String content;
    private boolean blockYn;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    public Article(int userId, String title, String content, boolean blockYn) {
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.blockYn = blockYn;
    }

    public Long getArticleId() {
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    /*    public Timestamp getCreateAt() { return createAt; }
    public void setCreateAt(Timestamp createAt) { this.createAt = createAt; }
    public Timestamp getUpdateAt() { return updateAt; }
    public void setUpdateAt(Timestamp updateAt) { this.updateAt = updateAt; }*/
}
