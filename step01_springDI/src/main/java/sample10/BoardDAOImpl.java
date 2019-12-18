package sample10;

import org.springframework.stereotype.Repository;

//@Component //xml의 <bean class="">와 동일. id는 클래스 이름의 첫글자만 소문자로 바꾼 것으로 결정
@Repository
public class BoardDAOImpl implements BoardDAO {

	@Override
	public void select() {
		System.out.println("call BoardDAOImpl.select()");
	}
}
