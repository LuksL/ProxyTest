package com.staticproxy.test.src;
/**
 * 静态代理--测试
 * @author Lee
 *2. 实现接口，里面有的真正的方法
 */
public class RealDoSomething implements DoSomething {
	@Override
	public void todo() {
		System.out.println("todo in RealDoSomething");
	}

}
