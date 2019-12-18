package sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Component // id="boardController"
@Controller
public class BoardController {
	@Autowired
	private BoardDTO boardDTO;
	@Autowired
	private BoardDTO boardDTO2;
	
	@Autowired
	private BoardService boardService;
	
	public void test() {
		System.out.println(String.format("boardDTO : %s", boardDTO));
		System.out.println(String.format("boardDTO2 : %s", boardDTO2));
		System.out.println(String.format("boardService : %s", boardService));
		boardService.select();
	}
}
