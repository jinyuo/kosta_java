package sample09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample09/springAnnotation.xml");
	
		EmpController controller = context.getBean("controller", EmpController.class);
		controller.test();
		
		ResourceBean resourceBean = context.getBean("resourceBean", ResourceBean.class);
		resourceBean.test();
	}

}
