package com.chuck.test;

import com.chuck.mapper.UserMapper;
import com.chuck.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class SpringBootMybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users= userMapper.selectList(null);
        System.out.println("users = " + users);

    }
    @Test
    public void test_insert(){
        User user = new User();
        user.setAge(66);
        user.setName("chuck");
        user.setEmail("546@163.com");
        int row = userMapper.insert(user);
    }

    @Test
    public void deleteById(){
        int row = userMapper.deleteById(1772228559479238658L);
        System.out.println("row = " + row);
        HashMap hashMap = new HashMap();
        hashMap.put("age",66);
        int i = userMapper.deleteByMap(hashMap);
        System.out.println("i = " + i);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(6L);
        user.setName("ahua");
        int i = userMapper.updateById(user);
        System.out.println("i = " + i);

        User user1 = new User();
        user1.setAge(22);
        int update = userMapper.update(user1, null);
        System.out.println("update = " + update);
    }
}
