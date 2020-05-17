package com.wmz.ba05;

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
	@Override
	public String doOther() {
		// TODO Auto-generated method stub
		System.out.println("执行doOther方法");
		return "abcde";
	}

}
