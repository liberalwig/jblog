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
	public int join(UserVo userVo) {
		System.out.println("UserService > join()");

		int count = UserDao.insertUser(userVo);

		return count;
	}

	// 유저_3> 로그인 폼: 없음

	// 유저_4> 로그인: 성공-실패
	public UserVo login(UserVo userVo) {
		System.out.println("UserService >  login()");

		UserVo authUser = userDao.getUser(userVo);

		return authUser;
	}

	// 유저_5> 로그아웃: 없음

	// 유저_6> 아이디중복체크
	public int idDoubCheck(UserVo userVo) {

		int result = userDao.getId(userVo);

		return result;
	}

}
