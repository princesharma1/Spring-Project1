package com.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String ss[]) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"appcontext.xml");
		Person p = (Person) context.getBean("d");
		p.display();
	}

}
