package top.wetor.bean;

public class Tag {
    /*
        t_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
        t_content varchar(30) NOT NULL,
        t_count int
     */
    private Integer t_id;
    private String t_content;
    private Integer t_count;

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_content() {
        return t_content;
    }

    public void setT_content(String t_content) {
        this.t_content = t_content;
    }

    public Integer getT_count() {
        return t_count;
    }

    public void setT_count(Integer t_count) {
        this.t_count = t_count;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "t_id=" + t_id +
                ", t_content='" + t_content + '\'' +
                ", t_count=" + t_count +
                '}';
    }
}
