package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//1. 기존 방식으로 호출
//		MessageBean bean = new MessageBeanEnImpl();
//		bean.sayHello("Heejung");
//		System.out.println("----------------------------------");
//		bean = new MessageBeanKoImpl();
//		bean.sayHello("희정");
		
		/*
		 * 2. Spring Container를 이용한 객체 주입
		 * 	: BeanFactory - 기본 객체 생성과 소멸 관리
		 *  : ApplicationContext - BeanFactory의 확장으로 BeanFactory의 기능 + 다국어지원, 메시지 처리 등등 더 많은 기능을 제공한다.
		 *  
		 *  특징
		 *  - 객체를 사전 초기화(미리 메모리에 생성)
		 *  - getBean을 여러 번 호출해도 동일한 객체를 사용한다. -> Singleton
		 *  - bean을 만들 때 scope="prototype" 옵션을 설정하면 지연초기화(getBean)을 할 때마다 새로운 객체를 생성해준다.
		 * */
		//ApplicationContext context = new ClassPathXmlApplicationContext("sample01/applicationContext.xml");
	
		//프로젝트 기준 경로
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/sample01/applicationContext.xml");
		
		//필요한 객체 가져오기
		MessageBean bean1 = context.getBean("ko", MessageBean.class);
		bean1.sayHello("희정");
		System.out.println("-----------------------------");
		MessageBean bean2 = context.getBean("en", MessageBean.class);
		bean2.sayHello("Heejeong");

		MessageBean bean3 = context.getBean("en", MessageBean.class);
		bean3.sayHello("Jang");
		
		System.out.println("bean1 : " + bean1);
		System.out.println("bean2 : " + bean2);
		System.out.println("bean3 : " + bean3);
	}
}
