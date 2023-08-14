package com.Thread.join;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResttController {
	
	@Autowired
	private JoinService joinService;
	
	@PostMapping("/checkID")
	public String checkID(@RequestParam("id") String id) {
		int result = joinService.checkID(id);
		JSONObject json = new JSONObject();
		json.put("result", result);
		return json.toString();
	}
	
}
