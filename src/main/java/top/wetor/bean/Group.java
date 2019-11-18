package top.wetor.bean;

public class Group {
/*  g_id count(10) not null,--主键
       g_name varchar2(60) not null,
       g_info varchar2(1200),
       g_rank count(10),
*/
    private Integer g_id;
    private String g_name;
    private String g_info;
    private Integer g_rank;
    private Integer g_count;

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getG_info() {
        return g_info;
    }

    public void setG_info(String g_info) {
        this.g_info = g_info;
    }

    public Integer getG_rank() {
        return g_rank;
    }

    public void setG_rank(Integer g_rank) {
        this.g_rank = g_rank;
    }

    public Integer getG_count() {
        return g_count;
    }

    public void setG_count(Integer g_count) {
        this.g_count = g_count;
    }

    @Override
    public String toString() {
        return "Group{" +
                "g_id=" + g_id +
                ", g_name='" + g_name + '\'' +
                ", g_info='" + g_info + '\'' +
                ", g_rank=" + g_rank +
                ", g_count=" + g_count +
                '}';
    }
}
