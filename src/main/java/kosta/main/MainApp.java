package kosta.main;

import kosta.domain.CommentbDTO;
import kosta.repository.EmpDAO;

public class MainApp {
	public static void main(String[] args) {
		// EmpDAO.associationTest();

		// EmpDAO.collectionTest();
		
		//EmpDAO.selectAll();
		
		//EmpDAO.insert(new CommentbDTO(7, "kim", "아파", null, null, null));
		EmpDAO.insert(new CommentbDTO(9, "kim", null, null, null, null));
	}
}
