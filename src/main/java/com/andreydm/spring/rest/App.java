package com.andreydm.spring.rest;

import com.andreydm.spring.rest.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> employeeList = communication.getAllEmployees();
//        System.out.println(employeeList);
//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);
//        Employee employee = new Employee();
//        employee.setId(12);
//        employee.setDepartment("HR");
//        employee.setName("Jon");
//        employee.setSalary(500);
//        employee.setSurname("Petrov");
//        communication.saveEmployee(employee);
//        communication.deleteEmployee(1);
    }
}
