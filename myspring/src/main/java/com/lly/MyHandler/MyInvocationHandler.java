package com.lly.MyHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	Object target;
	public MyInvocationHandler(Object target){
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(method.getName());
		if(method.getName().equals("query")){
			System.out.println("I am Proxy");
		}


		return method.invoke(target,args);

	}
}
