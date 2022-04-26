DROP TABLE IF EXISTS Article;
CREATE TABLE Article(
                        article_id INT PRIMARY KEY AUTO_INCREMENT,
                        user_id INT,
                        title VARCHAR(50),
                        content VARCHAR(50) ,
                        block_yn BOOLEAN,
                        created_at TIMESTAMP DEFAULT NOW(),
                        updated_at TIMESTAMP DEFAULT NOW()

);

DROP TABLE IF EXISTS COMMENT;
CREATE TABLE COMMENT
(
    comment_Id        INT PRIMARY KEY AUTO_INCREMENT,
    article_Id        INT,
    user_Id       INT,
    content VARCHAR(50),
    block_yn  BOOLEAN
);

INSERT INTO COMMENT (comment_Id,article_Id,user_Id,content,block_yn)
VALUES (1,1,1,'test',false);