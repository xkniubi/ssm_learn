package com.chuck.test;

import com.chuck.ioc_03.A;
import com.chuck.ioc_03.HappyComponent;
import com.chuck.ioc_04.javaBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {

    public void creatIoC(){
        //方式1:实例化并且指定配置文件
        //参数：String...locations 传入一个或者多个配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-03.xml");

        //方式2:先实例化，再指定配置文件，最后刷新容器触发Bean实例化动作 [springmvc源码和contextLoadListener源码方式]
        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext();
        //设置配置配置文件,方法参数为可变参数,可以设置一个或者多个配置
        context2.setConfigLocations("spring-03.xml");
        //后配置的文件,需要调用refresh方法,触发刷新配置
        context2.refresh();

    }

    @Test
    public void getBeanFromIoC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-03.xml");
        HappyComponent happyComponent = (HappyComponent) applicationContext.getBean("happyComponent");

        HappyComponent happyComponent1 = applicationContext.getBean("happyComponent", HappyComponent.class);

        A happyComponent2 = applicationContext.getBean(A.class);
        happyComponent2.doWork();

        System.out.println(happyComponent == happyComponent1);
        System.out.println(happyComponent1 == happyComponent2);


    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-04.xml");

        javaBean bean = applicationContext.getBean(javaBean.class);

        applicationContext.close();

        ClassPathXmlApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring-04.xml");
        ClassPathXmlApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("spring-04.xml");
        System.out.println(applicationContext1 == applicationContext2);
    }

}
