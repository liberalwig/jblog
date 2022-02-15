package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.service.BlogService;

@Controller
@RequestMapping(value="/blog")
public class BlogController {
	
	// 필드
	@Autowired
	BlogService blogService;
	
	// 메소드 일반
	// 블로그_1> 
	
	
	
}
