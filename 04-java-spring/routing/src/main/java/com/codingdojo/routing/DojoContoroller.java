package com.codingdojo.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/dojo")

public class DojoContoroller {
	@RequestMapping (value = "", method = RequestMethod.GET)
	public String dojo() {
		return "The Dojo is Awesome!";
	}
	
	@RequestMapping (value = "burbank", method = RequestMethod.GET)
	public String burbank() {
		return "Burbank Dojo is located in Douthern California";
	}

	@RequestMapping (value = "san-jose", method = RequestMethod.GET)
	public String sj() {
		return "SJ dojo is the headquarters.";
	}
}
// Another way to write a code to mapped it. The above code should be able to work with the "Coding Controller.java" method as well.
