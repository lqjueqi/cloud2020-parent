package com.mybatis.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;

/**
 * @author: Admin
 * @create: 2020/8/12 0:02
 */
public class MybatisDemo {

    public static void main(String[] args) {
        DataSource dataSource =getDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(BlogMapper.class);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        Blog blog = blogMapper.selectBlog(1);
        System.out.println(blog);
    }

    public static DataSource getDataSource(){
        DruidDataSource dataSource= new DruidDataSource();
        return dataSource;
    }
}
