package top.wetor.domain;

public class Tag {
    /*
        t_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
        t_content varchar(30) NOT NULL,
        t_count int
     */
    private Integer id;
    private String content;
    private Integer count;

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

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", count=" + count +
                '}';
    }
}
