package com.Thread.myinfo;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Thread.login.LoginDTO;

@Controller
public class MyInfoController {

	@Autowired
	private MyInfoService myInfoService;

	@GetMapping("/myinfo")
	public ModelAndView myinfo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();
		
		session.setAttribute("mid", "jijon");
	

		if (session.getAttribute("mid") != null) {

			String id = (String) session.getAttribute("mid");

			LoginDTO result = myInfoService.myInfo(id);
			
		
		if (result != null) {

			mv.addObject("result", result);
			mv.setViewName("myinfo");

		} else {
			
			mv.addObject("redirect:/login");
		}
			
		} else {
			mv.addObject("redirect:/login");
		}
		return mv;
		
		
		

	}
	
	
	
	@GetMapping("/profile")
	public String profile(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("mid") != null) {
			return "profile";

		} else {
			return "redirect:/login";
		}
	}
	
	
	
	@PostMapping("/profile")
	public ModelAndView profile2 (HttpServletRequest request) {

		HttpSession session = request.getSession();
		session.setAttribute("mid", "jijon");
		ModelAndView mv = new ModelAndView();
		
		if (session.getAttribute("mid") != null) {
			// 로그인했으면?
			String id = (String) session.getAttribute("mid");
			
	
			LoginDTO result = myInfoService.myInfo(id);
			
			mv.addObject("result", result);
			mv.setViewName("myinfo");
			
	
		} else {
			// 로그인 안다면?
		 mv.addObject("redirect:/login");
		}
		
		return mv;

	}
	

	
	
	
	
}
