package sample02;

public class Member {
	private String id;
	private String pwd;
	private int age;
	private String addr;
	
	public Member() {
		System.out.println("call Member()");
	
	}

	public Member(String id) {
		System.out.println("call Member(String id)");
		this.id = id;
	}

	public Member(String id, String pwd) {
		System.out.println("call Member(String id, String pwd)");
		this.id = id;
		this.pwd = pwd;
	}
	
	public Member(String id, int age) {
		System.out.println("call Member(String id, String pwd)");
		this.id = id;
		this.age = age;
	}

	public Member(String id, int age, String addr) {
		System.out.println("call Member(String id, int age, Strign addr)");
		this.id = id;
		this.age = age;
		this.addr = addr;
		System.out.println(id +  "| " + age +  "| " + addr);
	}

	public Member(String id, String pwd, int age, String addr) {
		System.out.println("calll Member(String id, String pwd, int age, String addr)");
		this.id = id;
		this.pwd = pwd;
		this.age = age;
		this.addr = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}
