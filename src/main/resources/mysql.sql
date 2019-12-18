-- ALTER TABLE table_name AUTO_INCREMENT = 1; 重置序列
-- set global time_zone='+8:00';
-- 用户表
create table tb_user(
       u_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
       u_name varchar(30) not null,
       u_mail varchar(40) not null,
       u_password varchar(30) not null,
       u_permission varchar(20)
);
-- 文章组表
create table tb_group(
       g_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
       g_name varchar(60) not null,
       g_info varchar(1200),
       g_rank int,
       g_count int
);
-- 文章表
create table tb_article(
       a_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
       g_id int not null,
       u_id int not null,
       a_title varchar(120) not null,
       a_tags varchar(900),
       a_create_time timestamp not null DEFAULT NOW(),
       a_modify_time timestamp not null DEFAULT NOW(),
       a_look int,
	   a_love int,
       a_cache_path varchar(120),
       a_content MEDIUMTEXT,
       a_is_top int(1) default 0,
       a_is_hidden int(1) ,
       a_is_delete int(1) ,
	   constraint tb_article_group_fk  FOREIGN KEY(g_id) REFERENCES tb_group(g_id),
	   constraint tb_article_user_fk FOREIGN KEY(u_id) REFERENCES tb_user(u_id)
);
-- 评论表
create table tb_comment(
       c_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
       c_cid int, -- 回复的人，可空
       a_id int not null,
       c_time timestamp not null  DEFAULT NOW(),
       c_name varchar(30) not null,
       c_mail varchar(40) not null,
       c_content TEXT,
	   constraint tb_comment_article_fk FOREIGN KEY(a_id) REFERENCES tb_article(a_id)
);
-- 标签表
create table tb_tag(
        t_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
        t_content varchar(30) NOT NULL unique,
        t_count int
);
-- 标签映射表
create table tb_tag_map(
        t_id int not null,
        a_id int not null,
        constraint tb_tag_map_tag_fk  FOREIGN KEY(t_id) REFERENCES tb_tag(t_id),
        constraint tb_tag_map_article_fk FOREIGN KEY(a_id) REFERENCES tb_article(a_id)
);