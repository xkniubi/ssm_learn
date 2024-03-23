package com.chuck.Controller;

import com.chuck.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private User user;


    @GetMapping("boot")
    public String hello(){
        return "hello Springboot3!";
    }

    @GetMapping("chuck")
    public User chuck(){
        return user;
    }
}

