package wetor.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.wetor.myblog.bean.User;
import top.wetor.myblog.dao.UserDao;
import top.wetor.myblog.dao.UserDaoImpl;
import top.wetor.myblog.mapper.UserMapper;

import java.io.IOException;
import java.io.InputStream;

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
	}
	@Test
	public void mapperTest(){
		SqlSession session = ssf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		System.out.print(mapper.selectUserById(0));
	}
}
