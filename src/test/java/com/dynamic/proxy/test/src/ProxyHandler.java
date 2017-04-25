package com.dynamic.proxy.test.src;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {

	private Object target;
	
	/**
	 * ��ί�ж��󣬲����ش�����
	 * @param tar
	 * @return ������ .<br>
	 * 
	 * step:�󶨸���ʵ�ֵ����нӿڣ�ȡ�ô����� 
	 */
	public Object bind(Object tar){
		this.target = tar;
		
		//�󶨸���ʵ�ֵ����нӿڣ����ݷ���ȡ�ô����� 
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
