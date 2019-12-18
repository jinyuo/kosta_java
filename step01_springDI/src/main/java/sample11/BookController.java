package sample11;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	@Resource
	private BookDTO book1;
	@Resource
	private BookDTO book2;

	public BookController() {
		super();
	}

	void invoker() {
		bookService.save(book1, book2);
	}
}
