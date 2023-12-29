package com.chuck;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTemplateTest {
    public void testForJava(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql:///studb");
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");


        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(druidDataSource);
    }

    @Test
    public void testForIoC(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");

        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);


        // 插入值
        String sql = "insert into students (id, Name, gender, age, class) values (?,?,?,?,?)";
//        int rows = jdbcTemplate.update(sql,9,"李四","男",18,"大专");
//        System.out.println("rows = " + rows);


//        sql = "select * from students where id = ? ;";
//        Student student1 = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
//            Student student = new Student();
//            student.setId(rs.getInt("id"));
//            student.setName(rs.getString("name"));
//            student.setAge(rs.getInt("age"));
//            student.setGender(rs.getString("gender"));
//            student.setClasses(rs.getString("class"));
//            return student;
//        }, 1);
//        System.out.println("student1 = "+student1);


        sql = "select id,name,gender,age,class as classes from students ";
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println("studentList = " + studentList);

    }




}
