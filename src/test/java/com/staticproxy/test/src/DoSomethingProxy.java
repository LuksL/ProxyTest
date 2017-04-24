package com.staticproxy.test.src;
/**
 * 静态代理--测试
 * @author Lee
 *3. 代理工厂，实现 DoSomething 接口，<br>
 *	DoSomething doimpl = new RealDoSomething();
 *  实现方法里面调用RealDoSomething 里面的方法
 */
public class DoSomethingProxy implements DoSomething {

	DoSomething doimpl = new RealDoSomething();
	
	@Override
	public void todo() {

		doimpl.todo();
	}

}
