package sample04;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public void insert(Student student) {
		System.out.println("call StudentDAOImpl.insert()");
		System.out.println(String.format("name : %s", student.getName()));
		System.out.println(String.format("no : %d", student.getNo()));
		System.out.println(String.format("phone : %s", student.getPhone()));
		System.out.println(String.format("addr : %s", student.getAddr()));
	}

}
