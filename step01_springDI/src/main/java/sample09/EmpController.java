package sample09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpController {
	@Autowired
	private EmpDTO dto;

	@Autowired
	@Qualifier("aa")
	private EmpDTO emp;

	@Autowired
	private EmpService service;
	
	public void test() {
		System.out.println("dto : " + dto + " / " + dto.getEname());
		System.out.println("emp : " + emp + " / " + emp.getEname());
	}
}
