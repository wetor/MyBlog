package top.wetor.myblog.bean;

import java.util.Date;

/**
 * @author Li
 */
public class Article {
/*     a_id number(10) not null,--主键
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
*/
    private Integer a_id;
    private Integer g_id;
    private Integer u_id;
    private String a_title;
    private Date a_createtime;
    private Date a_modifytime;
    private Integer a_viewer;
    private String a_cachepath;
    private String a_content;
    private boolean a_istop;
    private boolean a_ishidden;
    private boolean a_isdelete;

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

    public Date getA_createtime() {
        return a_createtime;
    }

    public void setA_createtime(Date a_createtime) {
        this.a_createtime = a_createtime;
    }

    public Date getA_modifytime() {
        return a_modifytime;
    }

    public void setA_modifytime(Date a_modifytime) {
        this.a_modifytime = a_modifytime;
    }

    public Integer getA_viewer() {
        return a_viewer;
    }

    public void setA_viewer(Integer a_viewer) {
        this.a_viewer = a_viewer;
    }

    public String getA_cachepath() {
        return a_cachepath;
    }

    public void setA_cachepath(String a_cachepath) {
        this.a_cachepath = a_cachepath;
    }

    public String getA_content() {
        return a_content;
    }

    public void setA_content(String a_content) {
        this.a_content = a_content;
    }

    public boolean isA_istop() {
        return a_istop;
    }

    public void setA_istop(boolean a_istop) {
        this.a_istop = a_istop;
    }

    public boolean isA_ishidden() {
        return a_ishidden;
    }

    public void setA_ishidden(boolean a_ishidden) {
        this.a_ishidden = a_ishidden;
    }

    public boolean isA_isdelete() {
        return a_isdelete;
    }

    public void setA_isdelete(boolean a_isdelete) {
        this.a_isdelete = a_isdelete;
    }

    @Override
    public String toString() {
        return "Article{" +
                "a_id=" + a_id +
                ", g_id=" + g_id +
                ", u_id=" + u_id +
                ", a_title='" + a_title + '\'' +
                ", a_createtime=" + a_createtime +
                ", a_modifytime=" + a_modifytime +
                ", a_viewer=" + a_viewer +
                ", a_cachepath='" + a_cachepath + '\'' +
                ", a_content='" + a_content + '\'' +
                ", a_istop=" + a_istop +
                ", a_ishidden=" + a_ishidden +
                ", a_isdelete=" + a_isdelete +
                '}';
    }
}
