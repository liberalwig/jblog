package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;

@Service
public class UserService {

	// 필드
	@Autowired
	private UserDao userDao;
	
	// 유저_1> 회원가입 폼
	
	
	// 유저_2> 회원가입
	public int userInsert() {
		
		int count = UserDao.userInsert(userVo);
		return count;
	}
	
	// 유저_3> 로그인 폼
	
		
	//유저_4> 로그인: 성공-실패
	
	
	//유저_5> 로그아웃

	
	//유저_6> 회원정보 수정 폼
	
	
	//유저_7> 회원정보 수정
	
	
}
