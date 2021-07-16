package com.shunya.dojoSurvey.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainContoller {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@PostMapping("/result")
	public String result(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment, Model viewModel) {
		viewModel.addAttribute("nameResult", name);
		viewModel.addAttribute("locationResult", location);
		viewModel.addAttribute("languageResult", language);
		viewModel.addAttribute("commentResult", comment);
		if(language.equals("Java")) {
			return"redirect:/java";
		}else {
			return "result.jsp";
		}
	}
	@GetMapping("/java")
	public String java() {
		return "java.jsp";
	}
}