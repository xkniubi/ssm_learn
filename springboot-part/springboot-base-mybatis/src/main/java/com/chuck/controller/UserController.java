package com.chuck.controller;

import com.chuck.mapper.UserMapper;
import com.chuck.pojo.User;
import com.chuck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @GetMapping("get")
    public List<User> query(){
       return  userMapper.queryAll();
    }

    @GetMapping("delete")
    public void delete(){
        userService.delete();
    }
}
