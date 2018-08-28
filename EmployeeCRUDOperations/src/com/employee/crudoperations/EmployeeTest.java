package com.employee.crudoperations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hibernate.cfg.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("dao");
		Employee e = new Employee();
		e.setId(101);
		e.setName("naresh");
		e.setSalary(4500);
		dao.saveEmployee(e);
	}
}


