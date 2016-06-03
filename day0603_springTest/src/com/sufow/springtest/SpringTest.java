package com.sufow.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sufow.bean.Sufow;

public class SpringTest {

	public static void main(String[] args) {

		//»ñÈ¡ÊµÀý
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Sufow sufow = (Sufow)context.getBean("sufow");
		
		System.out.println(sufow.getUsername());
		
		
	}
}
