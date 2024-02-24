package com.chuck.mapper;

import com.chuck.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    // 根据id查询员工对象
    Employee queryById(Integer id);

    // 根据id删除员工信息
    int deleteById(Integer id);

    // 根据工资查询员工信息
    List<Employee> queryBySalary(Double salary);

    // 插入员工数据【实体对象】
    int insertEmp(Employee employee);

    // 根据员工姓名和工资查询员工信息
    List<Employee> queryByNameAndSalary (@Param("a") String name, @Param("b") Double salary);

    // 插入员工信息，传入的是一个map（name= 员工名字，salary  = 员工薪水）
    // mapper接口中不允许重载，方法名重复了，id名重复了
    int insertEmpMapper(Map data);

    String queryNameById(Integer id);

    Double querySalaryById(Integer id);

    Map<String,Object> selectEmpNameAndMaxSalary();
//    <!--    查询工资高于传入值的员工姓名-->
    List<String> queryNameBySalary(Double salary);

//<!--    查询全部员工信息-->
    List<Employee> queryAll();
}
