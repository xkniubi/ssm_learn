package com.chuck;

import com.chuck.config.JavaConfig;
import com.chuck.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaIoCTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController stu = annotationConfigApplicationContext.getBean(StudentController.class);
        stu.findAll();
    }
}
