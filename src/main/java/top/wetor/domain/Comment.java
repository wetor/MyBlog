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
    private Integer c_id;
    private Integer c_cid;
    private Integer a_id;
    private Date   c_time;
    private String c_name;
    private String c_mail;
    private String c_content;

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getC_cid() {
        return c_cid;
    }

    public void setC_cid(Integer c_cid) {
        this.c_cid = c_cid;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public Date getC_time() {
        return c_time;
    }

    public void setC_time(Date c_time) {
        this.c_time = c_time;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_mail() {
        return c_mail;
    }

    public void setC_mail(String c_mail) {
        this.c_mail = c_mail;
    }

    public String getC_content() {
        return c_content;
    }

    public void setC_content(String c_content) {
        this.c_content = c_content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "c_id=" + c_id +
                ", c_cid=" + c_cid +
                ", a_id=" + a_id +
                ", c_time=" + c_time +
                ", c_name='" + c_name + '\'' +
                ", c_mail='" + c_mail + '\'' +
                ", c_content='" + c_content + '\'' +
                '}';
    }
}
