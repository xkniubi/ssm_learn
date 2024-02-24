package com.chuck.mapper;

import com.chuck.pojo.Employee;

public interface EmployerMapper {

    //根据id查询员工信息
    Employee queryById(Integer id);

    Employee deleteById(Integer id);
}
