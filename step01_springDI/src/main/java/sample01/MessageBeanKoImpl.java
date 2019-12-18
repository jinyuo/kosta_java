package sample01;

public class MessageBeanKoImpl implements MessageBean {
	
	public MessageBeanKoImpl() {
		System.out.println("Call MessageBeanKoImpl()");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(String.format("%s 님, 안녕하세요.", name));

	}

}
