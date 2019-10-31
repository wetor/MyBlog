package top.wetor.myblog.bean;

public class IdCreater {
    /*r_id number(2) not null,
       r_user number(10) not null,
       r_group number(10) not null,
       r_article number(10) not null,
       r_conment number(10) not null
       */
    private Integer r_id;
    private Integer r_user;
    private Integer r_group;
    private Integer r_article;
    private Integer r_conment;

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public Integer getR_user() {
        return r_user;
    }

    public void setR_user(Integer r_user) {
        this.r_user = r_user;
    }

    public Integer getR_group() {
        return r_group;
    }

    public void setR_group(Integer r_group) {
        this.r_group = r_group;
    }

    public Integer getR_article() {
        return r_article;
    }

    public void setR_article(Integer r_article) {
        this.r_article = r_article;
    }

    public Integer getR_conment() {
        return r_conment;
    }

    public void setR_conment(Integer r_conment) {
        this.r_conment = r_conment;
    }

    @Override
    public String toString() {
        return "IdCreater{" +
                "r_id=" + r_id +
                ", r_user=" + r_user +
                ", r_group=" + r_group +
                ", r_article=" + r_article +
                ", r_conment=" + r_conment +
                '}';
    }
}
