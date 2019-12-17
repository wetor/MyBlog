package top.wetor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wetor.dao.CommentDao;
import top.wetor.domain.Comment;
import top.wetor.service.ICommentService;

import java.util.*;

@Service("commentService")
public class CommentServiceImpl implements ICommentService {
    @Autowired
    private CommentDao commentDao;

    @Override
    public void insertComment(Comment comment) {
        commentDao.insertComment(comment);
    }

    @Override
    public void deleteCommentById(Integer id) {
        commentDao.deleteCommentById(id);
    }

    @Override
    public void updateComment(Comment comment) {
        commentDao.updateComment(comment);
    }

    @Override
    public Comment selectCommentById(Integer id) {
        return commentDao.selectCommentById(id);
    }

    @Override
    public Integer selectCommentCount() {
        return commentDao.selectCommentCount();
    }


    @Override
    public Comment selectCommentTreeById(Integer id){
        return commentDao.selectCommentTreeById(id);
    }

    @Override
    public List<Comment> selectCommentPage(Integer begin, Integer number, Boolean asc) {
        return commentDao.selectCommentPage(begin, number, asc);
    }

    @Override
    public List<Comment> selectCommentAll(Boolean asc) {
        return commentDao.selectCommentAll(asc);
    }

    @Override
    public List<Comment> selectCommentPageByArticleId(Integer id, Integer begin, Integer number, Boolean asc) {
        return commentDao.selectCommentPageByArticleId(id, begin, number, asc);
    }


    @Override
    public List<Comment> selectCommentAllByArticleId(Integer id, Boolean asc) {
        return commentDao.selectCommentAllByArticleId(id, asc);
    }
}
