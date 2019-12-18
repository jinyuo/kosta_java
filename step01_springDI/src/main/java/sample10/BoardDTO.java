package sample10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // id=component
@Scope("prototype")
public class BoardDTO {
	@Value("10")
	private int no;
	@Value("Spring")
	private String subject;
	@Value("difficult")
	private String content;
	
	public BoardDTO() {
		super();
	}
	public BoardDTO(int no, String subject, String content) {
		super();
		this.no = no;
		this.subject = subject;
		this.content = content;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
