package top.wetor.bean;

public class TagMap {
    /*
    t_id int not null,
    a_id int not null,
     */
    private Integer t_id;
    private Integer a_id;

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    @Override
    public String toString() {
        return "TagMap{" +
                "t_id=" + t_id +
                ", a_id=" + a_id +
                '}';
    }
}
