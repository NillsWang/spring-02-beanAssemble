package com.wmz.ba07;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SomeServiceImpl implements ISomeService, BeanNameAware, BeanFactoryAware
			, InitializingBean, DisposableBean {
	
	String adao;
	String bdao;

	public void setAdao(String adao) {
		System.out.println("Step2:执行setAdo()");
		this.adao = adao;
	}

	public void setBdao(String bdao) {
		System.out.println("Step2:执行setBdo()");
		this.bdao = bdao;
	}

	public SomeServiceImpl() {
		System.out.println("Step1:对象的创建");
	}

	@Override
	public String doFirst() {
		// TODO Auto-generated method stub
		System.out.println("Step9:主业务方法");
		return "abcde";
	}

	@Override
	public void doSecond() {
		// TODO Auto-generated method stub
		System.out.println("执行doSecond方法");

	}
	
	public void initAfter() {
		System.out.println("Step7:初始化之后");
		
	}
	
	public void preDestroy() {
		System.out.println("Step11:销毁之前");
		
	}
	//获取beanid
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Step3:beanName = " + name);
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) 
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Step4:获取到beanFactory容器");
		
	}

	@Override
	public void afterPropertiesSet() 
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Step6:当前bean的初始化工作完毕");
		
	}

	@Override
	public void destroy() 
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Step10:准备销毁工作，准备销毁流程");
	}
	

}
