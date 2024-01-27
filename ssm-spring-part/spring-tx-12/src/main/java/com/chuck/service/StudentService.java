package com.chuck.service;

import com.chuck.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Service
//@Transactional(timeout = 3,rollbackFor = Exception.class,noRollbackFor = FileNotFoundException.class)
public class StudentService {
    
    @Autowired
    private StudentDao studentDao;

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void changeInfo() throws FileNotFoundException {
        studentDao.updateAgeById(88,1);
        System.out.println("-----------");
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        new FileInputStream("xxxx");
        studentDao.updateNameById("test1",1);
    }

    @Transactional(readOnly = true)
    public void getStudentInfo(){
    }

    /**
     * 声明两个独立修改数据库的事务业务方法
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void changeAge(){
        studentDao.updateAgeById(99,1);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void changeName(){
        studentDao.updateNameById("test2",1);
        int i = 1/0;
    }
}
