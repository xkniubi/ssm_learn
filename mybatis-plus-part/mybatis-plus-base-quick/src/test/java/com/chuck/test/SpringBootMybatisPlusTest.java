package com.chuck.test;

import com.chuck.mapper.UserMapper;
import com.chuck.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
}
