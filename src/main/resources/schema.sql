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
INSERT INTO Article (article_id,user_id,title,content,block_yn)
VALUES (1,1,'test','testcontent',false);

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


DROP TABLE IF EXISTS RATING;
CREATE TABLE IF NOT EXISTS RATING
(
    rating_id   int      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    lecture_id  int      NOT NULL,
    user_id     int      NOT NULL,
    rating      float    DEFAULT '0',
    comment     varchar(200)      NOT NULL,
    created_at  TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP  DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
);

INSERT INTO rating (rating_id, lecture_id, user_id, rating, comment, created_at, updated_at)
VALUES (1, 1, 1, 5, 'lecture1-1', now(), now());

INSERT INTO rating (rating_id, lecture_id, user_id, rating, comment, created_at, updated_at)
VALUES (2, 1, 2, 4, 'lecture1-2', now(), now());

INSERT INTO rating (rating_id, lecture_id, user_id, rating, comment, created_at, updated_at)
VALUES (3, 1, 3, 1, 'lecture1-3', now(), now());

INSERT INTO rating (rating_id, lecture_id, user_id, rating, comment, created_at, updated_at)
VALUES (4, 2, 1, 5, 'lecture2-1', now(), now());

INSERT INTO rating (rating_id, lecture_id, user_id, rating, comment, created_at, updated_at)
VALUES (5, 2, 2, 3, 'lecture2-2', now(), now());
