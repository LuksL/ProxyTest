package com.dynamic.proxy.test.src;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {

	private Object target;
	
	/**
	 * 绑定委托对象，并返回代理类
	 * @param tar
	 * @return 代理类 .<br>
	 * 
	 * step:绑定该类实现的所有接口，取得代理类 
	 */
	public Object bind(Object tar){
		this.target = tar;
		
		//绑定该类实现的所有接口，根据反射取得代理类 
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		// before todo()
		System.out.println("------------ before to do ------------");
		Object result = method.invoke(target, args);
		//after todo()
		System.out.println("------------ after to do ------------");
		return result;
	}
}
