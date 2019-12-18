package sample01;

public class MessageBeanEnImpl implements MessageBean {
	public MessageBeanEnImpl() {
		System.out.println("Call MessageBeanEnImpl");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println(String.format("Hello, dear %s.", name));

	}

}
