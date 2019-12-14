package top.wetor.domain;

import java.util.Date;

/**
 * @author Li
 */
public class Article {
/*     a_id number(10) not null,--主键
       g_id number(10) not null,--外键，组id
       u_id number(10) not null,--外键，用户id
       a_title varchar2(120) not null,
       a_tags varchar(900),
       a_create_time timestamp not null,
       a_modify_time timestamp not null,
       a_viewer number(10),
       a_cache_path varchar2(120),--缓存路径，文章内容的静态页面
       a_content clob,
       a_is_top char(1),
       a_is_hidden char(1),
       a_is_delete char(1),
*/
    private Integer a_id;
    private Integer g_id;
    private Integer u_id;
    private String a_title;
    private String a_tags;
    private Date a_create_time;
    private Date a_modify_time;
    private Integer a_look;
    private Integer a_love;
    private String a_cache_path;
    private String a_content;
    private boolean a_is_top;
    private boolean a_is_hidden;
    private boolean a_is_delete;

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getA_title() {
        return a_title;
    }

    public void setA_title(String a_title) {
        this.a_title = a_title;
    }

    public String getA_tags() {
        return a_tags;
    }

    public void setA_tags(String a_tags) {
        this.a_tags = a_tags;
    }

    public Date getA_create_time() {
        return a_create_time;
    }

    public void setA_create_time(Date a_create_time) {
        this.a_create_time = a_create_time;
    }

    public Date getA_modify_time() {
        return a_modify_time;
    }

    public void setA_modify_time(Date a_modify_time) {
        this.a_modify_time = a_modify_time;
    }

    public Integer getA_look() {
        return a_look;
    }

    public void setA_look(Integer a_look) {
        this.a_look = a_look;
    }

    public Integer getA_love() {
        return a_love;
    }

    public void setA_love(Integer a_love) {
        this.a_love = a_love;
    }

    public String getA_cache_path() {
        return a_cache_path;
    }

    public void setA_cache_path(String a_cache_path) {
        this.a_cache_path = a_cache_path;
    }

    public String getA_content() {
        return a_content;
    }

    public void setA_content(String a_content) {
        this.a_content = a_content;
    }

    public boolean isA_is_top() {
        return a_is_top;
    }

    public void setA_is_top(boolean a_is_top) {
        this.a_is_top = a_is_top;
    }

    public boolean isA_is_hidden() {
        return a_is_hidden;
    }

    public void setA_is_hidden(boolean a_is_hidden) {
        this.a_is_hidden = a_is_hidden;
    }

    public boolean isA_is_delete() {
        return a_is_delete;
    }

    public void setA_is_delete(boolean a_is_delete) {
        this.a_is_delete = a_is_delete;
    }

    @Override
    public String toString() {
        return "Article{" +
                "a_id=" + a_id +
                ", g_id=" + g_id +
                ", u_id=" + u_id +
                ", a_title='" + a_title + '\'' +
                ", a_tags='" + a_tags + '\'' +
                ", a_create_time=" + a_create_time +
                ", a_modify_time=" + a_modify_time +
                ", a_look=" + a_look +
                ", a_love=" + a_love +
                ", a_cache_path='" + a_cache_path + '\'' +
                ", a_content='" + a_content + '\'' +
                ", a_is_top=" + a_is_top +
                ", a_is_hidden=" + a_is_hidden +
                ", a_is_delete=" + a_is_delete +
                '}';
    }
}

