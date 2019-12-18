package sample03;

public class BookDAOImpl implements BookDAO {

	public BookDAOImpl() {
		System.out.println("call BookDAOImpl");
	
	}

	@Override
	public void insert(BookVo bookVo) {
		System.out.println(bookVo);
	}
}
