package com.wmz.ba05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		//从类路径中找xml文件，这里的配置文件存放在src下
		//加载spring配置文件，创建spring容器对象
		String resource = "/com/wmz/ba05/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		//从容其中获取指定bean对象
		ISomeService service1 = (ISomeService) ac.getBean("someService1");
		String result1 = service1.doFirst();
		System.out.println(result1);
		service1.doSecond();
		String doOther1 = service1.doOther();
		System.out.println(doOther1);
		System.out.println("--------------------------");
		ISomeService service2 = (ISomeService) ac.getBean("someService2");
		String result2 = service2.doFirst();
		System.out.println(result2);
		service2.doSecond();
		String doOther2 = service2.doOther();
		System.out.println(doOther2);
			
	}
	
}
