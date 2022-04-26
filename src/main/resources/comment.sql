CREATE TABLE IF NOT EXISTS COMMENT
(
    comment_Id        int NOT NULL AUTO_INCREMENT COMMENT '댓글 아이디',
    article_Id        int NOT NULL COMMENT '커뮤니티 아이디',
    user_Id       int NOT NULL COMMENT '작성자 아이디',
    comment text NOT NULL COMMENT '댓글 내용',
    block_yn  boolean      DEFAULT NULL COMMENT '댓글 노출 여부 y-0, n-1',
    block_comment       text NOT NULL COMMENT '작성자 아이디',
    PRIMARY KEY (comment_Id)
);


INSERT INTO COMMENT (comment_Id,article_Id,user_Id,comment,block_yn, block_comment)
VALUES (1,1,1,'test',true, 'dsadsad');