package com.javaex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	// 필드
	@Autowired
	private UserService userService;

	// 메소드 일반
	// 유저_1> 회원가입 폼
	@RequestMapping("/joinForm")
	public String joinForm() {
		System.out.println("UserController > joinForm()");

		return "user/joinForm";
	}

	// 유저_2> 회원가입
	public String join(@ModelAttribute UserVo userVo, HttpSession session) {
		System.out.println("UserController > join()");

		userService.userInsert(userVo);
		return "";
	}

	// 유저_3> 로그인폼

	// 유저_4> 로그인: 성공-실패

	// 유저_5> 로그아웃

	// 유저_6> 회원정보 수정 폼

	// 유저_7> 회원정보 수정

}
