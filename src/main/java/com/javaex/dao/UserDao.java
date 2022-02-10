package com.javaex.dao;

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
	public int userInsert(UserVo userVo) {
		System.out.println("UserDao > userInsert()");

		int count = sqlSession.insert("user.userInsert", userVo);

		System.out.println(count + "명의 회원이 추가되었습니다.");
		return count;
	}

// 유저_3> 로그인폼

// 유저_4> 로그인: 성공-실패

// 유저_5> 로그아웃

// 유저_6> 회원정보 수정 폼

// 유저_7> 회원정보 수정

}
