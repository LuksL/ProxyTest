package com.staticproxy.test.src;
/**
 * ��̬����--����
 * @author Lee
 *2. ʵ�ֽӿڣ������е������ķ���
 */
public class RealDoSomething implements DoSomething {
	@Override
	public void todo() {
		System.out.println("todo in RealDoSomething");
	}

}
