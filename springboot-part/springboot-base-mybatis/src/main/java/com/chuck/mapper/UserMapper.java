package com.chuck.mapper;

import com.chuck.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> queryAll();

    int delete(int i);
}
