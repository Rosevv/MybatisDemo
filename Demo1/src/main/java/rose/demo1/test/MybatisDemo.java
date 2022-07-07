package rose.demo1.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import rose.demo1.mapper.StuMapper;

import java.io.InputStream;
import java.util.List;

public class MybatisDemo {
    @Test
    public void  SelectAllTest() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        List<Stu> stus = mapper.SelectAll();

        System.out.println(stus);

    }

    @Test
    public void  SelectByIdTest() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);

        int id=3;

        List<Stu> stus = mapper.SelectById(id);

        System.out.println(stus);

    }

}
