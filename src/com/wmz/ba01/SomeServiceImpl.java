package com.wmz.ba01;

public class SomeServiceImpl implements ISomeService {
	
	//默认装配方式，使用无参构造器
	public SomeServiceImpl() {
		System.out.println("=======执行无参构造器========");
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

}
