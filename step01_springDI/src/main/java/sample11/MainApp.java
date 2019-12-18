package sample11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample11/springAnnotation.xml");
		context.getBean("bookController", BookController.class).invoker();
	}
}
