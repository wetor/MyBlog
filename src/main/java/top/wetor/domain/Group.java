package top.wetor.domain;

import java.io.Serializable;
import java.util.List;

public class Group extends BaseBean{
/*  g_id count(10) not null,--主键
       g_name varchar2(60) not null,
       g_info varchar2(1200),
       g_rank count(10),
*/
    private Integer id;
    private String name;
    private String info;
    private Integer rank;
    private Integer count;
    //组内文章
    private List<Article> articleList;
    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", rank=" + rank +
                ", count=" + count +
                ", articleList=" + articleList +
                '}';
    }
}
