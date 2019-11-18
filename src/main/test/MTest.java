package wetor.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.wetor.bean.Article;
import top.wetor.bean.User;
import top.wetor.mapper.ArticleMapper;
import top.wetor.mapper.UserMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class MTest {
	private static SqlSessionFactory ssf;

	static {
		String resource = "sqlMapConfig.xml";
		//读取配置文件
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource );
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			ssf = ssfb.build(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void userTest(){
		SqlSession session = ssf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user=new User();
		user.setU_id(0);
		user.setU_name("wetor");
		user.setU_mail("2929339419@qq.com");
		user.setU_password("123456");
		mapper.insertUser(user);
		session.commit();
	}
	@Test
	public void mapperTest(){
		SqlSession session = ssf.openSession();
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		Article article=new Article();
		article.setG_id(1);
		article.setU_id(1);
		article.setA_title("title");
		article.setA_tags("tag1,tag2,tag3");
		article.setA_create_time(new Date());
		article.setA_modify_time(new Date());
		article.setA_look(1);
		article.setA_love(1);

		mapper.insertArticle(article);
	}
}
