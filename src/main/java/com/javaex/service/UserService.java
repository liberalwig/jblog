package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	// 필드
	@Autowired
	private UserDao userDao;

	// 유저_1> 회원가입 폼: 없음

	// 유저_2> 회원가입
	public int insertUser(UserVo userVo) {
		System.out.println("UserService >  insertUser()");

		int count = UserDao.insertUser(userVo);
		
		return count;
	}

	// 유저_3> 로그인 폼: 없음

	// 유저_4> 로그인: 성공-실패
	public UserVo selectUser(UserVo userVo) {
		System.out.println("UserService >  selectUser()");
		
		UserVo authUser = userDao.selectUser(userVo);
		
		return authUser;
	}
	
	
	
	// 유저_5> 로그아웃


}
