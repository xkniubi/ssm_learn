package com.chuck;

import com.chuck.mapper.OrderMapper;
import com.chuck.pojo.Customer;
import com.chuck.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class MybatisTest {

    private SqlSession session;
    // junit会在每一个@Test方法前执行@BeforeEach方法

    @BeforeEach
    public void init() throws IOException {
        session = new SqlSessionFactoryBuilder()
                .build(
                        Resources.getResourceAsStream("mybatis-config.xml"))
                .openSession();
    }

    @Test
    public void test_01(){
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        Order order = mapper.queryOrderById(2);
        System.out.println("order = " + order);
    }

    @Test
    public void test_02(){
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        Customer customer = mapper.queryCustomerFromOrder(1);
        System.out.println("customer = " + customer);
        List<Order> orderList = customer.getOrderList();
        for(Order order :orderList){
            System.out.println("order = " + order);
        }
    }
    // junit会在每一个@Test方法后执行@@AfterEach方法
    @AfterEach
    public void clear() {
        session.commit();
        session.close();
    }

}
