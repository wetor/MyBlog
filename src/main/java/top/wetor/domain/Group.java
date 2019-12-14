package top.wetor.domain;

public class Group {
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

    public Integer getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", rank=" + rank +
                ", count=" + count +
                '}';
    }
}
