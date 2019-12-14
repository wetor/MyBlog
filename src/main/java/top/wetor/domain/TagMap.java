package top.wetor.domain;

public class TagMap {
    /*
    t_id int not null,
    a_id int not null,
     */
    private Integer tagId;
    private Integer articleId;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "TagMap{" +
                "tagId=" + tagId +
                ", articleId=" + articleId +
                '}';
    }
}
