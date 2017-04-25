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
		 * new һ������RealDoSomething������bind()�������棬����������ݷ���õ�class��Ȼ�����class�õ�interface
		 */
		todos.todo();

	}
}
