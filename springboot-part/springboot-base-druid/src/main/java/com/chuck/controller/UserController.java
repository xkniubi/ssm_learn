package com.chuck.controller;

import com.chuck.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("list")
    public List<User> queryAll(){
        String sql  ="select * from User;";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return query;

    }
}
