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

insert into Article (article_id, user_id, title, content, block_yn,created_at,updated_at) values (1, 1, 'TESTTITLE', 'Content1',false, now(), now());