package sample10;


import org.springframework.stereotype.Repository;

//@Resource(name = "boardMyBatisDaoImpl")
@Repository("boardMyBatisDaoImpl")
public class BoardMyBatisDAOImpl implements BoardDAO {
	@Override
	public void select() {
		System.out.println("call BoardMyBatisDAOImpl.select()");
	}
}
