package com.geedy.branch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuIOneController {

	@GetMapping("/menu1")
	public void menu1(Model model) {
		
		model.addAttribute("message", "menu1 결과");
	}
	
}
