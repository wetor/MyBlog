package top.wetor.service.impl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.wetor.domain.Comment;
import top.wetor.service.IArticleService;
import top.wetor.service.ICommentService;
import wetor.test.BaseTest;

import java.util.Date;
import java.util.List;


public class CommentServiceImplTest  extends BaseTest {

    @Test
    public void insertComment() {
        Comment comment=new Comment();
        comment.setCommentId(17);
        comment.setArticleId(1);
        comment.setTime(new Date());
        comment.setName("wetor");
        comment.setMail("2929");
        comment.setContent("这是");
        commentService.insertComment(comment);
    }

    @Test
    public void deleteCommentById() {
    }

    @Test
    public void updateComment() {
    }

    @Test
    public void selectCommentById() {
    }

    @Test
    public void selectCommentCount() {
    }

    @Test
    public void selectCommentTreeById() {
    }

    @Test
    public void selectCommentPage() {
    }

    @Test
    public void selectCommentAll() {
    }

    @Test
    public void selectCommentPageByArticleId() {
    }

    @Test
    public void selectCommentAllByArticleId() {
        List<Comment> commentList=commentService.selectCommentAllByArticleId(1,null);
        for(Comment com : commentList){
            System.out.println(com);
        }
    }
}
