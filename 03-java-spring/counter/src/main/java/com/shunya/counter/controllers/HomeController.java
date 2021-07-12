package com.shunya.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
	@RequestMapping(value="/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer pageVisitCount = (Integer) session.getAttribute("count");
		pageVisitCount++;
		session.setAttribute("count", pageVisitCount);
		return "index.jsp";
	}
	
	@GetMapping(value="/counter")
	public String counter(HttpSession session) {
		Integer pageVisitCount = (Integer) session.getAttribute("count");
		session.setAttribute("count", pageVisitCount);
		return "counter.jsp";
	}
}