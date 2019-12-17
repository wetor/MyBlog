package top.wetor.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import top.wetor.domain.Comment;

import java.util.List;
@Component
@Mapper
public interface CommentDao {
    /**
     * 新建评论
     * @param comment 评论
     */
    void insertComment(Comment comment);
    /**
     * 通过id删除评论，无子评论则直接删除，否则修改文本
     * @param id id
     */
    void deleteCommentById(Integer id);
    /**
     * 修改评论
     * @param comment 评论
     */
    void updateComment(Comment comment);
    /**
     * 通过id查询评论
     * @param id id
     * @return 评论
     */
    Comment selectCommentById(Integer id);

    /**
     * 查询评论数
     * @return 评论数
     */
    Integer selectCommentCount();

    /**
     * 通过id查询评论树
     * @param id id
     * @return 评论
     */
    Comment selectCommentTreeById(Integer id);
    /**
     * 查询按时间排序的一定数量评论,c_cid=null
     * @param begin 开始序号，从0开始
     * @param number 个数
     * @param asc 是否正序排列(由旧到新)
     * @return 评论列表
     */
    List<Comment> selectCommentPage(@Param("begin") Integer begin, @Param("number")Integer number, @Param("asc")Boolean asc);

    /**
     * 查询全部评论,c_cid=null
     * @param asc 是否正序排列(由旧到新)
     * @return 全部评论列表
     */
    List<Comment> selectCommentAll(@Param("asc")Boolean asc);

    /**
     * 通过id查询评论的一定数量回复
     * @param id 评论id
     * @param begin 开始序号，从0开始
     * @param number 个数
     * @param asc 是否正序排列(由旧到新)
     * @return 回复列表
     */
    List<Comment> selectCommentPageByArticleId(@Param("id") Integer id, @Param("begin") Integer begin, @Param("number")Integer number, @Param("asc")Boolean asc);
    /**
     * 查询指定文章的所以评论树
     * @param id 文章id
     * @param asc 是否正序排列(由旧到新)
     * @return 全部评论列表
     */
    List<Comment> selectCommentAllByArticleId(@Param("id") Integer id,@Param("asc")Boolean asc);

}
