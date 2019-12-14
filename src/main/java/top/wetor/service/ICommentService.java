package top.wetor.service;

import top.wetor.domain.Comment;

import java.util.List;

public interface ICommentService {
    /**
     * 新建评论
     * @param comment 评论
     */
    void insertComment(Comment comment);
    /**
     * 通过id删除评论
     * @param id id
     */
    void deleteCommentById(Integer id);
    /**
     * 修改组
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
     * 查询按时间排序的一定数量评论,c_cid=null
     * @param begin 开始序号，从0开始
     * @param number 个数
     * @param asc 是否正序排列(由旧到新)
     * @return 评论列表
     */
    List<Comment> selectCommentPage(Integer begin, Integer number, Boolean asc);

    /**
     * 查询全部评论,c_cid=null
     * @param asc 是否正序排列(由旧到新)
     * @return 全部评论列表
     */
    List<Comment> selectCommentAll(Boolean asc);

    /**
     * 通过id查询评论的一定数量回复
     * @param id 评论id
     * @param begin 开始序号，从0开始
     * @param number 个数
     * @param asc 是否正序排列(由旧到新)
     * @return 回复列表
     */
    List<Comment> selectCommentReplyPageById(Integer id, Integer begin, Integer number, Boolean asc);

    /**
     * 通过id查询评论的全部回复
     * @param id 评论id
     * @param asc 是否正序排列(由旧到新)
     * @return 全部回复列表
     */
    List<Comment> selectCommentReplyAllById(Integer id, Boolean asc);
    /**
     * 查询指定文章的评论
     * @param asc 是否正序排列(由旧到新)
     * @return 全部评论列表
     */
    List<Comment> selectArticleCommentAllById(Integer id,Boolean asc);

}
