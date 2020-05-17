package com.wmz.ba07;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	
	//bean: 当前调用执行Bean后处理器的Bean对象
	//beanName: 当前调用执行Bean后处理器的Bean对象id
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Step5:执行****before****");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) 
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Step8:执行****after****");
		
		return bean;
	}
	

}
