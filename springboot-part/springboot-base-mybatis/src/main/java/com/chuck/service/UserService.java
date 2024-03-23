package com.chuck.service;

import com.chuck.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void delete(){
        int rows = userMapper.delete(2);
        System.out.println("rows = " + rows);
    }
}
