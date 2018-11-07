package com.example.mybatisdemo.demo;

import com.example.mybatisdemo.Mapper.OrderLogMapper;
import com.example.mybatisdemo.pojo.OrderLog;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author dongsufeng
 * @create 2018/10/10 10:19
 */
public class MybatisDemo {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderLogMapper mapper = sqlSession.getMapper(OrderLogMapper.class);
//        OrderLog orderLog = mapper.selectByPrimaryKey(1385L);
        PageHelper.startPage(1,5);
        List<OrderLog> select = mapper.selectByExample(new OrderLog());
//        OrderLog orderLog = (OrderLog) sqlSession.selectOne("OrderLogMapper.selectByPrimaryKey", "1385");
        for (OrderLog orderLog: select) {
            System.out.println(orderLog.toString());

        }
    }
}
