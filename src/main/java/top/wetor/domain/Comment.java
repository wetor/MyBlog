package top.wetor.domain;

import java.util.Date;

public class Comment {
    /*
    c_id number(10) not null,--主键
       c_cid number(10),--父评论id
       a_id number(10) not null,--外键，文章id
       c_time timestamp not null,
       c_name varchar2(30) not null,
       c_mail varchar2(40) not null,
       c_content clob,
    */
    private Integer id;
    private Integer commentId;
    private Integer articleId;
    private Date   time;
    private String name;
    private String mail;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", commentId=" + commentId +
                ", articleId=" + articleId +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
