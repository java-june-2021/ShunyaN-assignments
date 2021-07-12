package com.shunya.displayDate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController{
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/date", method=RequestMethod.GET)
	public String date(Model viewModel) {
		Date date = new Date();
		String pattern = "EEEE, 'the 'dd ' of ' MMMM, yyyy";
		SimpleDateFormat dateOnly = new SimpleDateFormat(pattern);
		String dateInput = dateOnly.format(date);
		viewModel.addAttribute("date", dateInput);
		return "date.jsp";
	}
	
	@RequestMapping(value="/time", method=RequestMethod.GET)
	public String time(Model viewModel) {
		Date date = new Date();
		String pattern = "h:mm a";
		SimpleDateFormat timeOnly = new SimpleDateFormat(pattern);
		String timeInput = timeOnly.format(date);	
		viewModel.addAttribute("time", timeInput);
		return "time.jsp";
	}
}
