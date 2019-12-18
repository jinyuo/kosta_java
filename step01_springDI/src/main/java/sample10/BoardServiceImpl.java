package sample10;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component // id = boardServiceImpl
@Service
public class BoardServiceImpl implements BoardService {
	@Resource(name = "boardDAOImpl")
	private BoardDAO boardDao;
	@Autowired// byName으로 주입
	private BoardDAO boardMyBatisDaoImpl;
	
	@Override
	public void select() {
		System.out.println("call BoardServiceImpl.select()");
		boardDao.select();
		boardMyBatisDaoImpl.select();
	}

}
