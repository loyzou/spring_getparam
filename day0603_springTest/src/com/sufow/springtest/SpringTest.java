package com.sufow.springtest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
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
		
		Logger log = Logger.getLogger(SpringTest.class);
		log.info("springTest start");
		
		Log log2 = LogFactory.getLog(SpringTest.class);
		log2.info("�ڶ��ַ�ʽ��־");
		
		
		System.out.println(sufow.getUsername());
		
		//�ڶ��ַ�ʽ
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		Sufow sufow2 =  (Sufow)beanFactory.getBean("sufow");
		
		System.out.println(sufow2.getUsername());
		
		
	}
}
