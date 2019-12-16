package top.wetor.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Li
 */
public class Article implements Serializable {
/*     a_id number(10) not null,--主键
       g_id number(10) not null,--外键，组id
       u_id number(10) not null,--外键，用户id
       a_title varchar2(120) not null,
       a_tags varchar(900),
       a_create_time timestamp not null,
       a_modify_time timestamp not null,
       a_viewer number(10),
       a_cache_path varchar2(120),--缓存路径，文章内容的静态页面
       a_content clob,
       a_is_top char(1),
       a_is_hidden char(1),
       a_is_delete char(1),
*/
    private Integer id;
    private Integer groupId;
    private Integer userId;
    private String title;
    private String tags;
    private Date createTime;
    private Date modifyTime;
    private Integer lookNum;
    private Integer loveNum;
    private String cachePath;
    private String content;
    private Boolean isTop;
    private Boolean isHidden;
    private Boolean isDelete;

    //顶层评论列表
    private List<Comment> commentList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getLookNum() {
        return lookNum;
    }

    public void setLookNum(Integer lookNum) {
        this.lookNum = lookNum;
    }

    public Integer getLoveNum() {
        return loveNum;
    }

    public void setLoveNum(Integer loveNum) {
        this.loveNum = loveNum;
    }

    public String getCachePath() {
        return cachePath;
    }

    public void setCachePath(String cachePath) {
        this.cachePath = cachePath;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getTop() {
        return isTop;
    }

    public void setTop(Boolean top) {
        isTop = top;
    }

    public Boolean getHidden() {
        return isHidden;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", tags='" + tags + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", lookNum=" + lookNum +
                ", loveNum=" + loveNum +
                ", cachePath='" + cachePath + '\'' +
                ", content='" + content + '\'' +
                ", isTop=" + isTop +
                ", isHidden=" + isHidden +
                ", isDelete=" + isDelete +
                ", commentList=" + commentList +
                '}';
    }
}

