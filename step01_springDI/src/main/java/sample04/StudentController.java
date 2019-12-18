package sample04;

public class StudentController {
	private StudentService service;
	private Student student;
	
	public StudentController() {
		System.out.println("call StudentController()");
	}
	
	public void setService(StudentService service) {
		this.service = service;
		System.out.println("call StudentController.setService(StudentService service)");
	}

	public void setStudent(Student student) {
		this.student = student;
		System.out.println("call StudentController.setStudent(Student student)");
	}
	
	public void insert() {
		//서비스의 serviceInsert 호출
		service.serviceInsert(student);
	}
}
