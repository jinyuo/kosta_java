package kosta.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("kosta/exam/applicationContext.xml");

		/**
		 * AOP proxyServer는 기본 interface를 기반으로 생성
		 * : interface를 구현한 구현객체에 advice를 적용할 때는
		 * 반드시 interface를 통해 메소드를 호출해야
		 * proxyServer를 생성할 수 있다. -J2SE 기반
		 * 
		 * 만약, proxy-target-class="true"를 설정하면
		 * CGLIB 방식으로 proxyServer 생성한다.
		 * 이러면 interface이던 아니던 상관없음.
		 * */
		MessageService service = context.getBean("target", MessageService.class);
		service.korHello();
//		System.out.println("---------------------------------");
//		service.engHello();
//		System.out.println("---------------------------------");
//		service.hello();
//		System.out.println("---------------------------------");
//		service.hello("hee");
//		
//		UserService userService = context.getBean("userService", UserService.class);
//		System.out.println("---------------------------------");
//		userService.testHello();
//		System.out.println("---------------------------------");
//		userService.insertHello("hee");
		
	}

}
