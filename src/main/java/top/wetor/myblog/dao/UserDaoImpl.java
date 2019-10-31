package top.wetor.myblog.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.wetor.myblog.bean.User;

public class UserDaoImpl implements UserDao {
    private SqlSessionFactory ssf;

    public UserDaoImpl(SqlSessionFactory ssf) {
        this.ssf = ssf;
    }

    @Override
    public User getUserById(Integer id) {
        //生产一个sqlSession
        SqlSession session = ssf.openSession();

        //操作数据库
        //参数1：要操作的sql语句   参数2 sql语句的参数
        return session.selectOne("UserMapper.selectUserById", 1);
    }
    @Override
    public void insertUser(User user){
        //生产一个sqlSession
        SqlSession session = ssf.openSession();

        //操作数据库
        //参数1：要操作的sql语句   参数2 sql语句的参数
        session.insert("UserMapper.insertUser", user);
        session.commit();
    }
}
