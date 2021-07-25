package com.shunya.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shunya.languages.models.Language;
import com.shunya.languages.sevices.LanguageService;

@Controller
@RequestMapping("/languages")
public class LanguageController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("")
	public String index(@ModelAttribute("language") Language language, Model viewModel) {
			viewModel.addAttribute("allLanguage", this.lService.allLanguage());
			return "/languages/index.jsp";
	}
	
	@PostMapping("")
	public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "/languages/index.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect:/languages";
	}
	
	@PostMapping("/{id}/edit")
	public String updatedLanguage(@Valid @PathVariable("id") Long id, @ModelAttribute("LanguageFind") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "/languages/edit.jsp";
		} else {
			lService.updatedLanguage(id, language);
			return "redirect:/languages";
		}
	}
	
	@GetMapping("/{id}/delete")
	public String deleteLanguage(@PathVariable("id") Long id) {
		if(lService.getOneLanguage(id) != null) {
			lService.deleteLanguage(id);
		}
		return "redirect:/languages";
	}
	
	@GetMapping("/{id}")
	public String getOneLanguage(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("oneLanguage", this.lService.getOneLanguage(id));
		return "/languages/singleview.jsp";
	}
	
	@PutMapping("{/id}")
	public void updatedLanguage(@PathVariable("id") Long id, Language language) {
		this.lService.updatedLanguage(id, language);
	}
	
	@PostMapping("/{id}")
	public void deleteLanguagePost(@PathVariable("id")Long id) {
		this.lService.deleteLanguage(id);
	}
}
