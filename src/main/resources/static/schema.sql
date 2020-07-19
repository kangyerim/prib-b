CREATE TABLE news
(
    `news_key`       INT             NOT NULL    AUTO_INCREMENT,
    `news_link`      VARCHAR(255)    NULL,
    `news_category`  VARCHAR(10)     NULL,
    PRIMARY KEY (news_key)
)default character set utf8 collate UTF8_GENERAL_CI;

CREATE TABLE storeHouse
(
    `store_index_key`  INT            NOT NULL    AUTO_INCREMENT,
    `saved_date`       DATE           NULL,
    `news_key`         VARCHAR(10)    NULL,
    `user_key`         VARCHAR(10)    NULL,
    PRIMARY KEY (store_index_key)
)default character set utf8 collate UTF8_GENERAL_CI;

CREATE TABLE person
(
    `user_key`       INT            NOT NULL    AUTO_INCREMENT,
    `user_id`        VARCHAR(10)    NULL,
    `password`       VARCHAR(10)    NULL,
    `user_name`      VARCHAR(8)     NULL,
    `birth_date`     VARCHAR(8)     NULL,
    `contact_phone`  VARCHAR(13)    NULL,
    `contact_email`  VARCHAR(30)    NULL,
    `register_date`  DATE           NULL,
    `positioin`      VARCHAR(10)    NULL,
    PRIMARY KEY (user_key)
)default character set utf8 collate UTF8_GENERAL_CI;