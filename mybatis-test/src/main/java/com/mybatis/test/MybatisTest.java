package com.mybatis.test;

import com.google.common.collect.Maps;
import com.mybatis.test.entity.User;
import org.apache.ibatis.annotations.Select;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


interface UserMapper {

    @Select("select * from user where id=#{id}")
    List<User> selectUserList(Integer id, String name);
}


/**
 * @author: Admin
 * @create: 2020/8/7 20:56
 */
public class MybatisTest {
    public static void main(String[] args) {
        UserMapper userMapper = (UserMapper) Proxy.newProxyInstance(MybatisTest.class.getClassLoader(), new Class<?>[]{UserMapper.class}, (proxy, method, arg) -> {
            Select annotation = method.getAnnotation(Select.class);
            if (annotation != null) {
                String[] value = annotation.value();
                System.out.println(Arrays.toString(value));
                //System.out.println(Arrays.asList(value));
            }
            Map<String, Object> map = buildMethodArgNameMap(method, arg);
            System.out.println(map);
            return null;
        });
        userMapper.selectUserList(1, "zs");
    }

    public static String parseSql(Method method, Map<String, Object> nameArgsMap) {
        return null;
    }


    public static Map<String, Object> buildMethodArgNameMap(Method method, Object[] args) {
        Map<String, Object> nameArgsMap = Maps.newHashMap();
        Parameter[] parameters = method.getParameters();
        int index[] = {0};
        Arrays.asList(parameters).forEach(parameter -> {
            String name = parameter.getName();
            nameArgsMap.put(name, args[index[0]]);
            System.out.println(name+"---"+args[index[0]]);
            index[0]++;

        });
        return nameArgsMap;
    }
}
