package sample08;

public class BookDAOImpl implements BookDAO {
	private DbUtil dbUtil;
	
	public BookDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookDAOImpl(DbUtil dbUtil) {
		super();
		this.dbUtil = dbUtil;
	}

	@Override
	public void save(EmailSender emailSender, MessageSender messageSender, BookDTO book1, BookDTO book2) {
		System.out.println(String.format("emailSender = %s", emailSender));
		System.out.println(String.format("messageSender = %s", messageSender));
		System.out.println(String.format("book1 = %s", book1));
		System.out.println(String.format("book2 = %s", book2));
		System.out.println(String.format("dbUtil = %s", dbUtil));
	}
	
}
