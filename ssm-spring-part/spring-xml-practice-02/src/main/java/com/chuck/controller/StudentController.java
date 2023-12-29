package com.chuck.controller;

import com.chuck.pojo.Student;
import com.chuck.service.impl.StudentServiceImpl;

import java.util.List;

public class StudentController {


    private StudentServiceImpl studentService;

    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println("最终学员数据"+all);

    }

    public void setStudentService(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }
}
