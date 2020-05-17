package com.wmz.ba07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
	
	//Bean的生命始末
	//Step1:对象的创建                                       无参构造器
	//Step2:执行setAdo()                 set方法
	//Step2:执行setBdo()                 set方法
	//Step3:beanName = someService       setBeanName获取Bean的id
	//Step4:获取到beanFactory容器                 setBeanFactory获取Bean的容器
	//Step5:执行****before****           Bean后处理器，初始化之前
	//Step6:当前bean的初始化工作完毕            afterPropertiesSet初始化完毕
	//Step7:初始化之后                                       initAfter初始化之后
	//Step8:执行****after****            Bean后处理器，初始化之后
	//Step9:主业务方法                                       主业务方法
	//Step10:准备销毁工作，准备销毁流程       destroy
	//Step11:销毁之前                                         preDestroy
	@Test
	public void test01() {
		//从类路径中找xml文件，这里的配置文件存放在src下
		//加载spring配置文件，创建spring容器对象
		String resource = "/com/wmz/ba07/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		//从容其中获取指定bean对象
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doFirst();
		//销毁方法的执行有两个要求：
		// 1.被销毁的的对象要是singleton,即单例的
		// 2.容器要被显式的关闭
		((ClassPathXmlApplicationContext)ac).close();
			
	}
	
}
