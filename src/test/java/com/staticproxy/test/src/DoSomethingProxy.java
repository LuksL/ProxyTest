package com.staticproxy.test.src;
/**
 * ��̬����--����
 * @author Lee
 *3. ��������ʵ�� DoSomething �ӿڣ�<br>
 *	DoSomething doimpl = new RealDoSomething();
 *  ʵ�ַ����������RealDoSomething ����ķ���
 */
public class DoSomethingProxy implements DoSomething {

	DoSomething doimpl = new RealDoSomething();
	
	@Override
	public void todo() {

		doimpl.todo();
	}

}
