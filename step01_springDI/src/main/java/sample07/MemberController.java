package sample07;

public class MemberController {
	private MemberVO memberVO;
	private MemberVO memberVO2;

	public MemberController() {
		System.out.println("call MemberController()");
	}

	public MemberController(MemberVO memberVO) {
		super();
		this.memberVO = memberVO;
	}

	public MemberController(MemberVO aaa, MemberVO memberVO2) {
		super();
		this.memberVO = aaa;
		this.memberVO2 = memberVO2;
		
		System.out.println("call MemberController(MemberVO memberVO, MemberVO memberVO2)");
		System.out.println("memberVO : " + memberVO);
		System.out.println("memberVO2 : " + memberVO2);
		System.out.println("memberVO.name : " + memberVO.getName());
		System.out.println("memberVO2.name : " + memberVO2.getName());
	}



	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
		System.out.println("call setMemberVO(MemberVO memberVO) : " + memberVO);
		System.out.println("이름 : " + memberVO.getName());
	}

	public MemberVO getMemberVO2() {
		return memberVO2;
	}

	public void setMemberVO2(MemberVO memberVO2) {
		this.memberVO2 = memberVO2;
		System.out.println("call setMemberVO2(MemberVO memberVO2) : " + memberVO2);
		System.out.println("이름 : " + memberVO2.getName());
	}
	
	
}
