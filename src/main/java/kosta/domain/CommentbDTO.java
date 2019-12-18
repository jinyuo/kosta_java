package kosta.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CommentbDTO {
	private int commentNo;
	private String userId;
	private String commentContent;
	private String regDate;

	// 1:1인 경우
	private UserDTO user;

	// 1 : 대
	private List<ReplyDTO> replies;
}
