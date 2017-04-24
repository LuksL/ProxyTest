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
		todos.todo();

	}
}
