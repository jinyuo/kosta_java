package sample08;

public class BookServiceImpl implements BookService {
	private BookDAO bookDao;
	private MessageSender messageSender;
	private EmailSender emailSender;
	
	public BookServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookServiceImpl(BookDAO bookDao) {
		super();
		this.bookDao = bookDao;
	}
	
	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
	}
	
	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	@Override
	public void save(BookDTO bookDTO1, BookDTO bookDTO2) {
		bookDao.save(this.emailSender, this.messageSender, bookDTO1, bookDTO2);
		
	}
	
}
