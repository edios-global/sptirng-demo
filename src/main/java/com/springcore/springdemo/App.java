package com.springcore.springdemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springdemo.constructor.Vechicle;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/springdemo/config.xml");
//    	AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/springdemo/config.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springdemo/constructor/constructor_config.xml");
		context.registerShutdownHook();
		Vechicle v1 = (Vechicle) context.getBean("v1");
		System.out.println(v1.toString());

	}
}
