package com.chuck.service.impl;

import com.chuck.dao.impl.StudentDaoImpl;
import com.chuck.pojo.Student;
import com.chuck.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDaoImpl studentDao;

    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDao.queryAll();
        System.out.println("studentService:"+studentList);
        return studentList;
    }

    public void setStudentDao(StudentDaoImpl studentDao) {

        this.studentDao = studentDao;
    }
}
