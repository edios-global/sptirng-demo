package com.springcore.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/springdemo/config.xml");
    	AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/springdemo/config.xml");
    	context.registerShutdownHook();
        Employe emp =  (Employe)context.getBean("emp1");
        
        System.out.println(emp.toString());
        
        
    }
}
