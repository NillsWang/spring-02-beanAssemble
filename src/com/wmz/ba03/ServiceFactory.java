package com.wmz.ba03;

//静态工厂
public class ServiceFactory {
	
	public static ISomeService getSomeService() {
		return new SomeServiceImpl();
	}

}
