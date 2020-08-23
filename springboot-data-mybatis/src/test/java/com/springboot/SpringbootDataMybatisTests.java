package com.springboot;

import com.springboot.entities.Employee;
import com.springboot.mapper.EmployeeMapper;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.sql.SQLException;

/**
 * @author: Admin
 * @create: 2020/7/12 22:52
 */
//@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDataMybatisTests {

    //@Autowired
    private EmployeeMapper employeeMapper;

    //@Autowired
    private RedisTemplate redisTemplate;

    //@Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void contextLoads() throws SQLException {
        Employee emp = employeeMapper.getEmpById(1);
        System.out.println(emp);
    }

    @Test
    public void test01(){
        stringRedisTemplate.opsForValue().append("msg","hello");
    }

    @Test
    public void test02(){
        Employee emp = employeeMapper.getEmpById(1);
        redisTemplate.opsForValue().set("emp-01",emp);
    }
}
