package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {

	// 필드
	@Autowired
	private SqlSession sqlSession;

	// 메소드 일반
	// 유저_1> 회원가입 폼

	// 유저_2> 회원가입
	public int insertUser(UserVo userVo) {
		System.out.println("UserDao > insertUser()");

		int count = sqlSession.insert("user.insertUser", userVo);

		System.out.println(count + "명의 회원이 추가되었습니다.");
		return count;
	}

	// 유저_3> 로그인 폼: 없음

	// 유저_4> 로그인: 성공-실패
	public UserVo getUser(UserVo userVo) {
		System.out.println("UserDao > selectUser()");

		return sqlSession.selectOne("user.getUser", userVo);
	}

		// 유저_5> 로그아웃: 없음

	// 유저_6> 아이디중복체크	
	public UserVo getId(UserVo userVo) {
		System.out.println("UserDao > getId()");

		return sqlSession.selectOne("user.getId", userVo);
	}

}
