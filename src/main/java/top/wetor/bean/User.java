package top.wetor.bean;

public class User {
    /*u_id number(10) not null,--主键
       u_name varchar2(30) not null,
       u_mail varchar2(40) not null,
       u_password varchar2(30) not null,
*/
    private Integer u_id;
    private String u_name;
    private String u_mail;
    private String u_password;
    private String u_permission;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_mail() {
        return u_mail;
    }

    public void setU_mail(String u_mail) {
        this.u_mail = u_mail;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_permission() {
        return u_permission;
    }

    public void setU_permission(String u_permission) {
        this.u_permission = u_permission;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_mail='" + u_mail + '\'' +
                ", u_password='" + u_password + '\'' +
                ", u_permission='" + u_permission + '\'' +
                '}';
    }
}
