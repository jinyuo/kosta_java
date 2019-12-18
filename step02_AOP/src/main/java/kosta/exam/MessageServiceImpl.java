package kosta.exam;

import org.springframework.aop.framework.AopContext;

public class MessageServiceImpl implements MessageService {

	@Override
	public void korHello() {
		System.out.println("CORE MessageServiceImpl.korHello()");
		System.out.println("++++++++++++++++++++++++++++++++++");
		//현재 aop proxyServer 구하기
		MessageService service = (MessageService)AopContext.currentProxy();
		service.engHello();
		System.out.println("++++++++++++++++++++++++++++++++++");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void engHello() {
		System.out.println("CORE MessageServiceImpl.engHello()");
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public String hello() {
		System.out.println("CORE MessageServiceImpl.hello()");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Hello";
	}

	@Override
	public int hello(String name) {
		System.out.println("CORE MessageServiceImpl.hello(String name)");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 5;
	}

}
