package com.contructor.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"appcontext.xml");
		Questions q = (Questions) ctx.getBean("conlist");
		q.display();

	}

}
