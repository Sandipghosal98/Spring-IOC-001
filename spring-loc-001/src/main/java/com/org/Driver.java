package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
		rabbit r = ac.getBean(rabbit.class, "r");
		System.out.println(r);
		AbstractApplicationContext aac = (AbstractApplicationContext) ac;
		aac.close();
		
		
//		ac = null;           //garbage collection//
//		System.gc();
	}

}
