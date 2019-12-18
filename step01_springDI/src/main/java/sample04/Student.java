package sample04;

public class Student {
	private String name;
	private int no;
	private String phone;
	private String addr;

	public Student() {
		System.out.println("call Student()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("call setName(String name) : " + name);
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {

		System.out.println("call setNo(int no) : " + no);
		this.no = no;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		System.out.println("call setPhone(String phone) : " + phone);
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		System.out.println("call setAddr(String addr) : " + addr);
		this.addr = addr;
	}

}