package com.chuck.dao.impl;

import com.chuck.dao.StudentDao;
import com.chuck.pojo.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Student> queryAll() {
        String sql = "select id,name,gender,age,class as classes from students ";
        List<Student> student = this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println("studentDao = " + student);
        return student;
    }
}
