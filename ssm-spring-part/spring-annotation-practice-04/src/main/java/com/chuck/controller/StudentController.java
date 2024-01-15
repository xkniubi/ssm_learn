package com.chuck.controller;

import com.chuck.pojo.Student;
import com.chuck.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println(all);
    }
}
