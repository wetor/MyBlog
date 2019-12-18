package wetor.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.wetor.dao.ArticleDao;
import top.wetor.dao.TagDao;
import top.wetor.dao.TagMapDao;
import top.wetor.dao.UserDao;
import top.wetor.domain.Article;
import top.wetor.domain.Comment;
import top.wetor.domain.User;
import top.wetor.service.IArticleService;
import top.wetor.service.ICommentService;
import top.wetor.service.ITagService;
import top.wetor.service.IUserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * junit-spring
 * 1 pom中添加spring-test
 * 2 @RunWith(SpringJUnit4ClassRunner.class)指定测试类
 * 3 @ContextConfiguration()指定spring的xml或配置类
 * 		locations:指定xml文件位置，加上classpath关键字
 * 		classes:指定配置类
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MTest {
	@Autowired
	private SqlSessionFactory ssf;

	@Autowired
	private IUserService userService;

	@Autowired
	private IArticleService articleService;

	@Autowired
	private ITagService tagService;

	@Autowired
	private ICommentService commentService;

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
	public void deleteCommentById(){
		commentService.deleteCommentById(18);
	}
	@Test
	public void selectCommentTreeById() {

		//Comment comment=commentService.selectCommentTreeById(1);
		//System.out.println(comment);
		List<Comment> commentList=commentService.selectCommentAllByArticleId(1,null);
		for(Comment com : commentList){
			System.out.println(com);
		}

	}

	@Test
	public void tagService_deleteTagByString(){
		tagService.deleteTagByString("ccc,ddd");
	}
	@Test
	public void articleService_deleteArticleById(){

		articleService.deleteArticleById(22);
	}
	@Test
	public void articleService_insertArticle() throws Exception {
		Article article=new Article();
		article.setGroupId(1);
		article.setUserId(1);
		article.setTitle("title22223333");
		article.setTags("tag3,tag2,tag1");
		article.setCreateTime(new Date());
		article.setModifyTime(new Date());
		article.setLookNum(1);
		article.setLoveNum(1);
		article.setDelete(false);
		articleService.insertArticle(article);
	}
	@Test
	public void userServiceTest(){
		User user=new User();
		user.setId(null);
		user.setName("xxxxx");
		user.setMail("2929339419@qq.com");
		user.setPassword("123456");
		userService.insertUser(user);
	}
	@Test
	public void userTest() throws Exception {

		SqlSession session = ssf.openSession();
		UserDao mapper = session.getMapper(UserDao.class);
		User user=new User();
		user.setId(null);
		user.setName("wetor");
		user.setMail("2929339419@qq.com");
		user.setPassword("123456");
		mapper.insertUser(user);
		session.commit();
	}
	@Test
	public void articleTest() throws Exception {
		SqlSession session = ssf.openSession();
		ArticleDao mapper = session.getMapper(ArticleDao.class);
		Article article=new Article();
		article.setId(1);
		article.setUserId(1);
		article.setTitle("title22223333");
		article.setTags("tag3,tag2,tag1");
		article.setCreateTime(new Date());
		article.setModifyTime(new Date());
		article.setLookNum(1);
		article.setLoveNum(1);

		mapper.insertArticle(article);
		session.commit();
	}
	@Test
	public void tagTest() throws Exception {
		SqlSession session = ssf.openSession();
		TagDao mapper = session.getMapper(TagDao.class);
		mapper.updateTagByString("tag1,tag2,tag3");
		session.commit();
	}
	@Test
	public void tagAllTest()throws Exception {
		SqlSession session = ssf.openSession();
		TagDao mapper = session.getMapper(TagDao.class);
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("aaa,bbb,faasf");
		ls.add("ccc,afasd,faasf");
		ls.add("eee,bbb,faasfxxx");
		mapper.updateTagAll(ls);
		session.commit();
	}
	@Test
	public void tagMapTest()throws Exception {
		SqlSession session = ssf.openSession();
		TagMapDao mapper = session.getMapper(TagMapDao.class);
		List<Article> al= mapper.selectArticleByTagId(87,null,null);
		for (Article article:al) {
			System.out.println(article);

		}
		session.commit();
	}
}
