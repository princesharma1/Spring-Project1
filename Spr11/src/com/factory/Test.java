package com.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String ss[]) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("appcontext.xml");
	AA a = (AA)ctx.getBean("aa");
	a.msg();
}
}
