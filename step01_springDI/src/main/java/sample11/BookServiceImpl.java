package sample11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDAO bookDao;
	@Autowired
	private MessageSender messageSender;
	@Autowired
	private EmailSender emailSender;
	
	public BookServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(BookDTO bookDTO1, BookDTO bookDTO2) {
		bookDao.save(this.emailSender, this.messageSender, bookDTO1, bookDTO2);
		
	}
	
}
