package top.wetor.domain;

import java.io.Serializable;
import java.util.List;

public class Tag implements Serializable {
    /*
        t_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
        t_content varchar(30) NOT NULL,
        t_count int
     */
    private Integer id;
    private String content;
    private Integer count;
    //包含标签的文章
    private List<Article> articleList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "Tag{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", count=" + count +
                ", articleList=" + articleList +
                '}';
    }
}
