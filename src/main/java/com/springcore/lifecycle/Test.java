package com.springcore.lifecycle;

import com.springcore.ref.ClasspathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		Sam s1=(Sam) context.getBean("s1");
		System.out.println(s1);
		
		//registering shutdown hook
		context.registerShutdownHook();
		
		
		Anno a1=(Anno) context.getBean("a1");
		System.out.println(a1);
	}	

}
