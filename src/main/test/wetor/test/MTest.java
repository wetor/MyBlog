package wetor.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.wetor.domain.Article;
import top.wetor.domain.User;
import top.wetor.dao.ArticleDao;
import top.wetor.dao.TagMapDao;
import top.wetor.dao.TagDao;
import top.wetor.dao.UserDao;
import top.wetor.service.IUserService;
import top.wetor.service.impl.UserServiceImpl;

import java.util.*;

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
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class MTest {
	@Autowired
	private SqlSessionFactory ssf;

	@Autowired
	private IUserService userService;


	@Test
	public void userServiceTest(){
		User user=new User();
		user.setU_id(null);
		user.setU_name("xxxxx");
		user.setU_mail("2929339419@qq.com");
		user.setU_password("123456");
		userService.insertUser(user);
	}
	@Test
	public void userTest() throws Exception {

		SqlSession session = ssf.openSession();
		UserDao mapper = session.getMapper(UserDao.class);
		User user=new User();
		user.setU_id(null);
		user.setU_name("wetor");
		user.setU_mail("2929339419@qq.com");
		user.setU_password("123456");
		mapper.insertUser(user);
		session.commit();
	}
	@Test
	public void articleTest() throws Exception {
		SqlSession session = ssf.openSession();
		ArticleDao mapper = session.getMapper(ArticleDao.class);
		Article article=new Article();
		article.setG_id(1);
		article.setU_id(1);
		article.setA_title("title22223333");
		article.setA_tags("tag3,tag2,tag1");
		article.setA_create_time(new Date());
		article.setA_modify_time(new Date());
		article.setA_look(1);
		article.setA_love(1);

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
