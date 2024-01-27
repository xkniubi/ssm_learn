package com.chuck.test;

import com.chuck.config.JavaConfig;
import com.chuck.service.StudentService;
import com.chuck.service.TopService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * projectName: com.atguigu.test
 *
 * description:
 */
@SpringJUnitConfig(JavaConfig.class)
public class TxTest {

    @Autowired
    private StudentService studentService;

    @Autowired
    private TopService topService;

//    @Test
//    public void  testTx(){
//        studentService.changeInfo();
//    }

    @Test
    public void test(){
        topService.topService();
    }

}
