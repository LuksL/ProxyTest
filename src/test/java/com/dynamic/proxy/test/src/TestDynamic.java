package com.dynamic.proxy.test.src;

import org.junit.Test;

import com.staticproxy.test.src.DoSomething;
import com.staticproxy.test.src.RealDoSomething;

public class TestDynamic {

	@Test
	public void Testtodo() {
		ProxyHandler pHandler = new ProxyHandler();
		//
		DoSomething todos = (DoSomething) pHandler.bind(new RealDoSomething());
		// todos.todo();
		/**
		 * new 一个对象RealDoSomething，传入bind()方法里面，方法里面根据反射得到class，然后根据class得到interface
		 */
		todos.todo();

	}
}
