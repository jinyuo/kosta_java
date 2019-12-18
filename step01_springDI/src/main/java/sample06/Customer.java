package sample06;

public class Customer {
	private String id;
	private int age;
	private String addr;
	
	public Customer() {
		System.out.println("call Customer()");
	}
	public Customer(String id) {//<contructor-arg
		System.out.println("call Customer(String id)" + id);
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		System.out.println("call setId(String id)" + id);
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("call setAge(int age)" + age);
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		System.out.println("call setAddr(String addr)" + addr);
		this.addr = addr;
	}
	
	
}
