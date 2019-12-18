package sample02;

public class MemberService {
	private MemberDAO memberDAO;
	private Member member;
	
	public MemberService() {
		System.out.println("call MemberService()");
	}
	
	public MemberService(MemberDAO memberDAO, Member member) {
		this.memberDAO = memberDAO;
		this.member = member;
		
		System.out.println("call MemberService(MemberDAO memberDAO, Member member)");
		System.out.println(memberDAO);
		System.out.println(member);
	}
	
	public void insert() {
		memberDAO.insert(member);
	}
}
