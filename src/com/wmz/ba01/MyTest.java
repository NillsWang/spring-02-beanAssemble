package com.wmz.ba01;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyTest {
	
	@Test
	public void test01() {
		//从类路径中找xml文件，这里的配置文件存放在src下
		//加载spring配置文件，创建spring容器对象
		String resource = "/com/wmz/ba01/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		//从容其中获取指定bean对象
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doFirst();
		service.doSecond();
			
	}
	
}
