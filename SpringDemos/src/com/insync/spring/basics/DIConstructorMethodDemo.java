package com.insync.spring.basics;

//These libraries are required when using BeanFactory for creating beans
//These are commented out as we have commented out Bean Factory related code 
/*
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
*/

//These libraries are required when using Application Context
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Import Employee class as we are creating Employee object here.
import com.insync.spring.beans.Employee;

//This class demonstrated Dependency Injection by Constructor Method
//Dependency Files: com.insync.spring.beans.Employee class file, Employee.xml bean config file
//
public class DIConstructorMethodDemo {

	public static void main(String[] args) {
		//Using Bean Factory
		/*
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("Employee.xml"));
		Employee employee=(Employee)beanFactory.getBean("employee");
		employee.showEmployeeInfo();
		*/
		
		//Using Application Context
		ApplicationContext context=new ClassPathXmlApplicationContext("Employee.xml");
		Employee employee=(Employee)context.getBean("employee");
		employee.showEmployeeInfo();
		
		Employee employeeObj=(Employee)context.getBean("employeeObj");
		employeeObj.showEmployeeInfo();
		
	}
}
