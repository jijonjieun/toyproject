package com.Thread.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThreadController {
	
	@Autowired
	private ThreadService threadService;
	

	@GetMapping("/")
	public String thread(Model model) {
		List<ThreadDTO> list= threadService.threadList();
		model.addAttribute("list", list);
		return "thread";
	}
	
	
}
