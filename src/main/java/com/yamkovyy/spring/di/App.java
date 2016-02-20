package com.yamkovyy.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		Human oleksandr = (Human)context.getBean("oleksandr");
		oleksandr.hello();
		
		Human artem = (Human)context.getBean("artem");
		artem.hello();
		
		System.out.println("\n");
		
		Room room830 = (Room) context.getBean("room830");
		room830.students();
	}

}
