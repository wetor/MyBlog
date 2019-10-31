--统计表
create table tb_blog_idcreater(
       r_id number(2) not null,
       r_user number(10) not null,
       r_group number(10) not null,
       r_article number(10) not null,
       r_conment number(10) not null,
       constraint tb_blog_idcreater_pk PRIMARY KEY (r_id)--主键
);
insert into tb_blog_idcreater values(0,0,0,0,0);
commit;
--用户表
create table tb_blog_user(
       u_id number(10) not null,--主键
       u_name varchar2(30) not null,
       u_mail varchar2(40) not null,
       u_password varchar2(30) not null,
       constraint tb_blog_user_pk PRIMARY KEY (u_id)--主键
);
--文章组表
create table tb_blog_group(
       g_id number(10) not null,--主键
       g_name varchar2(60) not null,
       g_info varchar2(1200),
       g_rank number(10),
       constraint tb_blog_group_pk PRIMARY KEY (g_id)--主键
);
--文章表
create table tb_blog_article(
       a_id number(10) not null,--主键
       g_id number(10) not null,--外键，组id
       u_id number(10) not null,--外键，用户id
       a_title varchar2(120) not null,
       a_createtime timestamp not null,
       a_modifytime timestamp not null,
       a_viewer number(10),
       a_cachepath varchar2(120),--缓存路径，文章内容的静态页面
       a_content clob,
       a_istop char(1),
       a_ishidden char(1),
       a_isdelete char(1),
       constraint tb_blog_article_pk PRIMARY KEY (a_id),--主键
       constraint tb_blog_article_group_fk foreign key (g_id) references tb_blog_group(g_id),--外键
       constraint tb_blog_article_user_fk foreign key (u_id) references tb_blog_user(u_id)--外键
);
--评论表
create table tb_blog_conment(
       c_id number(10) not null,--主键
       c_cid number(10),--父评论id
       a_id number(10) not null,--外键，文章id
       c_time timestamp not null,
       c_name varchar2(30) not null,
       c_mail varchar2(40) not null,
       c_content clob,
       constraint tb_blog_conment_pk PRIMARY KEY (c_id),--主键
       constraint tb_blog_conment_conment_fk foreign key (c_id) references tb_blog_conment(c_id),--外键
       constraint tb_blog_conment_article_fk foreign key (a_id) references tb_blog_article(a_id)--外键
);
