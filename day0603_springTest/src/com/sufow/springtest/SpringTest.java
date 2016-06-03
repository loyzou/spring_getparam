package com.sufow.springtest;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.sufow.bean.Sufow;

public class SpringTest {

	public static void main(String[] args) {

		//��ȡʵ��
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Sufow sufow = (Sufow)context.getBean("sufow");
		
		System.out.println(sufow.getUsername());
		
		//�ڶ��ַ�ʽ
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		Sufow sufow2 =  (Sufow)beanFactory.getBean("sufow");
		
		System.out.println(sufow2.getUsername());
		
		
	}
}
