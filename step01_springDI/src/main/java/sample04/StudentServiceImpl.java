package sample04;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO;
	
	public StudentServiceImpl() {
		System.out.println("call StudentServiceImpl()");
	}

	public void setStudentDao(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
		System.out.println("call setStudentDao(StudentDAO studentDao) : " + studentDAO);
		
	}
	
	@Override
	public void serviceInsert(Student student) {
		studentDAO.insert(student);
	}

}
