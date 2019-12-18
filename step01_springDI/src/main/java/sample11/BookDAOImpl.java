package sample11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {
	@Autowired
	private DbUtil dbUtil;
	
	@Override
	public void save(EmailSender emailSender, MessageSender messageSender, BookDTO book1, BookDTO book2) {
		System.out.println(String.format("emailSender : %s", emailSender));
		System.out.println(String.format("messageSender : %s", messageSender));
		System.out.println(String.format("book1 : %s", book1));
		System.out.println(String.format("book2 : %s", book2));
		System.out.println(String.format("dbUtil : %s", dbUtil));
	}

}
