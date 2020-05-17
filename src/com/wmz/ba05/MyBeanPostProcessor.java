package com.wmz.ba05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	//bean: 当前调用执行Bean后处理器的Bean对象
	//beanName: 当前调用执行Bean后处理器的Bean对象id
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("执行****Bean初始化before****");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) 
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("执行****Bean初始化after****");
		Object proxy = null;
		//只对符合条件的bean做代理增强
		if("someService1".equals(beanName)) {
			
			proxy = Proxy.newProxyInstance(
				bean.getClass().getClassLoader(), 
				bean.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) 
							throws Throwable {
						// TODO Auto-generated method stub
						Object result;
						result = method.invoke(bean, args);
						if ("doOther".equals(method.getName()) ) {
							result = ((String) result).toUpperCase();
							return result;	
						}
						return result;
					}
				});
			 return proxy;
			 
		}
		return bean;
	}
	
}