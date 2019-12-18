package kosta.exam;

public class UserService {
	public boolean testHello() {
		System.out.println("CORE UserService.testHello()");
		
		try {
			Thread.sleep(1300);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	public int insertHello(String name) {
		System.out.println("CORE UserService.insertHello()");
		
		try {
			Thread.sleep(2500);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return 10;
	}
}
