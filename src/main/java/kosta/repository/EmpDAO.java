package kosta.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kosta.domain.CommentbDTO;
import kosta.domain.ReplyDTO;

public class EmpDAO {
	/**
	 * 1 : 1인 경우
	 */
	public static void associationTest() {
		try (SqlSession session = DbUtil.getSession()) {
			List<CommentbDTO> list = session.selectList("JoinMapper.associationJoin");

			for (CommentbDTO dto : list) {
				System.out.println(dto.getCommentNo() + " | " + dto.getUserId() + " | " + dto.getRegDate());

			}
		}
	}
	/**
	 * 1 : 다인 경우
	 */
	public static void collectionTest() {
		try (SqlSession session = DbUtil.getSession()) {
			List<CommentbDTO> list = session.selectList("JoinMapper.collectionJoin");
			
			for (CommentbDTO dto : list) {
				System.out.println(dto.getCommentNo() + " | " + dto.getUserId() + " | " + dto.getRegDate());
				for(ReplyDTO replyDTO : dto.getReplies())
					System.out.println(replyDTO.getReplyNo() + " | " + replyDTO.getReplyContent() + " | " + replyDTO.getRegDate() + " | " + replyDTO.getUserId());
				System.out.println();
			}
		}
	}
	/**
	 * 1 : 다인 경우
	 */
	public static void selectAll() {
		try (SqlSession session = DbUtil.getSession()) {
			List<CommentbDTO> list = session.selectList("JoinMapper.selectAll");
			
			for (CommentbDTO dto : list) {
				System.out.println(dto.getCommentNo() + " | " + dto.getUserId() + " | " + dto.getRegDate());
			}
		}
	}
	
	public static int insert(CommentbDTO commentbDTO) {
		int result = 0;
		SqlSession session = null;
		boolean state = false;
		
		try {
			session = DbUtil.getSession();
			state = session.insert("JoinMapper.insert", commentbDTO) > 0 ? true : false;
			
			if(state)
				System.out.println("등록 성공");
			else
				System.err.println("등록 실패");
		} finally {
			DbUtil.sessionClose(session, state);
		}
		return result;
	}
}
