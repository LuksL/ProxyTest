package com.staticproxy.test.src;

public class TestDoSomething {
	public static void main(String[] args) {
		DoSomething dotest = new DoSomethingProxy();
		dotest.todo();
	}
}
