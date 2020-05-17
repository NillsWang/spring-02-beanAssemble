package com.wmz.ba06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		//从类路径中找xml文件，这里的配置文件存放在src下
		//加载spring配置文件，创建spring容器对象
		String resource = "/com/wmz/ba06/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		//从容其中获取指定bean对象
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doFirst();
		service.doSecond();
		//销毁方法的执行有两个要求：
		// 1.被销毁的的对象要是singleton,即单例的
		// 2.容器要被显式的关闭
		((ClassPathXmlApplicationContext)ac).close();
			
	}
	
}
