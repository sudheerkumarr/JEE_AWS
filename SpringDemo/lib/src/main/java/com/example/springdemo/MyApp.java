/*
 * Developed by Rod Jhonson in 2003
  Makes JEE application development easy
  Open source and lightweight framework
  Supports various frameworks like Struts, Hibernate, EJB etc.,
  It comprises serveral modules such as 
  Test, Bean, Core, IOC, DAO, Context, Web MVC, DAO, AOP etc.,
  
  Advantages:
  Predefined templates for JDBC, Hibernate, JPA etc., no need to write much code
  Loose Coupling - because of DI
  Easy to test - because of DI
  leghtweight because of pojo implementation
  fast development
  
  IOC(Inversion Of Control) - Design pattern principle that control flow of a program is inverted.
      i.e., external sources, control flow of program instead of developer
  DI(Dependency Injection) - Design pattern implements IOC principles.
     Provide objects that required by other object by using field/constructor/setter injection.
      

IOC container 
  - Instantiate, configure & assemble the object responsible for dependency injection
  - XML files or Annotations are used to provide metadata to the IOC container

- Core & Bean modules provides IOC and DI
- Data Access / Integration - helps to interact with db
  compromises JDBC, ORM etc.,
- Web - supports to create web application
  compromises Web, Web Struts/Servlets/Portlet etc.,

- Steps to create spring app
 Load the spring jar files
  org.springframework.core-3.0.1.RELEASE-A
  com.springsource.org.apache.commons.logging-1.1.1
  org.springframework.beans-3.0.1.RELEASE-A

 OR - Gradle
   // https://mvnrepository.com/artifact/org.springframework/spring-core
   implementation group: 'org.springframework', name: 'spring-core', version: '5.3.9'
	
  // https://mvnrepository.com/artifact/org.springframework/spring-context
  implementation group: 'org.springframework', name: 'spring-context', version: '5.3.9'

- create spring application
 1. create the class
 2. create the xml file to provide the values
 3. create the test class
 4. Run the test class

Types of IOC containers
 1. BeanFactory(I)
      XmlBeanFactory(C)

 public static void main(String[] args) {
   Resource resource=new ClassPathResource("applicationContext.xml");  
   BeanFactory factory=new XmlBeanFactory(resource);
 }


 2. ApplicationContext(I) - build on top of BeanFactory
      ClassPathXmlApplicationContext(C) - provides additional functionalities such as AOP integration etc., along with BeanFactory

 public static void main(String[] args) {
  ApplicationContext context =   
    new ClassPathXmlApplicationContext("applicationContext.xml");  
 }

Ways to DI
----------
By Constructor injection
By Setter Method injection
By Feild injection


 */

package com.example.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyApp {

	public static void main(String[] args) {
		// Create Bean factory
		Resource resource=new ClassPathResource("applicationContext.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Employee emp1 = (Employee)factory.getBean("emp1");
		Employee emp2 = (Employee)factory.getBean("emp2");
		
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getName());
		
		
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.getName());
		
		emp1.setName("Jay");
		System.out.println(emp1.getName());
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		Address addr1 = (Address)factory.getBean("addr1");
		Address addr2 = (Address)factory.getBean("addr2");
		
		System.out.println(addr1);
		System.out.println(addr2);
		
		emp1.getAddress().setCity("Hyderabad");
		emp1.getAddress().setState("Telangana");
		System.out.println(emp1);
		
		
		
		
	}

}
