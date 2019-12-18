package sample03;

public class BookController {
	BookDAO bookDAO;
	BookVo bookVo;
	
	public BookController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookController(BookDAO bookDAO, BookVo bookVo) {
		super();
		this.bookDAO = bookDAO;
		this.bookVo = bookVo;
	}

	public void bookInsert() {
		bookDAO.insert(bookVo);
	}
}
