package com.example.onlineeduplatformcommunity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ArticleCreateRequest {
    Integer userId;
    String title;
    String content;
}
