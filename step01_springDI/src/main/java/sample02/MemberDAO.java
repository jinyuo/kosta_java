package sample02;

public class MemberDAO {
	public MemberDAO() {
		System.out.println("call MemberDAO()");
	
	}

	public void insert(Member member) {
		System.out.println("call MemberDAO.insert(Member member)");
		System.out.println(member);
	}
}
