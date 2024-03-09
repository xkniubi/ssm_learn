package com.chuck.controller;

import com.chuck.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public List<User> queryPage(@RequestParam(required = false,defaultValue = "1") Integer page, @RequestParam(required = false,defaultValue = "10") Integer age){
        System.out.println("page = " + page);
        System.out.println("age = " + age);
        return null;
    }

    @PostMapping
    public User save(@RequestBody User user){
        System.out.println("user = " + user);
        return null;
    }

    @GetMapping("/{id}")
    public User queryUser(@PathVariable Integer id){
        System.out.println("id = " + id);
        return null;
    }

    @PutMapping
    public User updateUser(@RequestBody User user ){
        System.out.println("user = " + user);
        return null;
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Integer id){
        System.out.println("id = " + id);
        return null;
    }

    @GetMapping("/search")
    public List<User> get(@RequestParam String keywork,
                    @RequestParam(required = false,defaultValue = "1") Integer page,
                    @RequestParam(required = false,defaultValue = "10") Integer size){
        return null;
    }
}
