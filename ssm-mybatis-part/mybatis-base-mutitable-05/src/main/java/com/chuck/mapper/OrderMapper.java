package com.chuck.mapper;

import com.chuck.pojo.Customer;
import com.chuck.pojo.Order;

public interface OrderMapper {
  Order queryOrderById(Integer orderId);

  Customer queryCustomerFromOrder(Integer customerId);

}