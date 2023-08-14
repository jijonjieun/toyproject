package com.Thread.myinfo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView profile(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("mid", "jijon");
		ModelAndView mv = new ModelAndView();
		
		if (session.getAttribute("mid") != null) {
			// 로그인했으면?
			String id = (String) session.getAttribute("mid");
			
	
			LoginDTO dto = myInfoService.myInfo(id);
			
			System.out.println(dto.getM_id());
			
			mv.addObject("dto", dto);
			mv.setViewName("profile");
			
	
		} else {
			// 로그인 안다면?
		 mv.addObject("redirect:/login");
		}
		
		return mv;

	}
	
	
	
	@GetMapping("/changeinfo")
	public String join() {
		return "changeinfo";
	}
	
	@PostMapping("/changeinfo")
	public String changeinfo(@RequestParam Map<String, Object> map) {
		myInfoService.changeinfo(map);
	
			return "myinfo";
	
	}
	
	
	
	
	

	
	
	
	
}
