package com.spring.core.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
import com.springcore.ref.ClasspathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/auto/wire/annotation/config.xml");
		Emp emp1=context.getBean("emp1",Emp.class);
		System.out.println(emp1);
		
		
	}

}
