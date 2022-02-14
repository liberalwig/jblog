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
	@RequestMapping("/join")
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("UserController > join()");

		userService.join(userVo);

		return "user/joinSuccess";
	}

	// 유저_3> 아이디중복체크
	@RequestMapping("/idDoubCheck")
	public String idDoubCheck(@ModelAttribute UserVo userVo) {
		System.out.println("UserController >idDoubCheck()");
				
		return userService.idDoubCheck(userVo);
	}
	
	// 유저_4> 로그인폼
	@RequestMapping("/loginForm")
	public String loginForm() {
		System.out.println("UserController >loginForm()");

		return "user/loginForm";
	}

	// 유저_5> 로그인: 성공-실패
	@RequestMapping("/login")
	public String login(UserVo userVo, HttpSession session) {
		System.out.println("UserController >login()");

		UserVo authUser = userService.login(userVo);
		System.out.println(authUser);

		if (authUser != null) {
			session.setAttribute("authUser", authUser);

			System.out.println(" 로그인에 성공했습니다");
			return "redirect:/";
		} else {
			System.out.println("로그인에 실패했습니다");

			return "redirect:/user/loginForm?result=fail";
		}
	}

	// 유저_6> 로그아웃
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("UserController >logout()");

		session.removeAttribute("authUser");
		session.invalidate();

		return "redirect:/";
	}

}