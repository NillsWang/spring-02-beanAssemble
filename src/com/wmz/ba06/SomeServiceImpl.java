package com.wmz.ba06;

public class SomeServiceImpl implements ISomeService {
	
	
	public SomeServiceImpl() {
		System.out.println("===============");
	}

	@Override
	public String doFirst() {
		// TODO Auto-generated method stub
		System.out.println("执行doFirst方法");
		return "abcde";
	}

	@Override
	public void doSecond() {
		// TODO Auto-generated method stub
		System.out.println("执行doSecond方法");

	}
	
	public void afterInit() {
		System.out.println("初始化之后");
		
	}
	
	public void preDestroy() {
		System.out.println("销毁之前");
		
	}
	

}
