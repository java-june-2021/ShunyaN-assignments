package com.shunya.theCode.HomeController;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class HomeController{
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/code")
	public String codeFunc() {
			return "code.jsp";
		}
		
	@RequestMapping("/tryCode")
    public String codeSubmission(@RequestParam("codesubmit") String codesubmit, HttpSession session, RedirectAttributes redirectAttributes, Model model ) {
		System.out.println(codesubmit);
		if (codesubmit.equals("pikachu")) {
			return "code.jsp";
		}
		else {
			redirectAttributes.addFlashAttribute("tryMessage", "You need to try harder!");
//			model.addAttribute("tryMessage", "You need to try harder!");
			return "redirect:/";
		}
	}
	
	
	
//	@RequestMapping(path="/", method=@RequestMethod.POST)
//	public String login(@RequestParam(value="username") String username,
//		@RequestParam(value="password") String password) {
//		return "redirect:/dashboard";
//	}
////	
//    @RequestMapping("/")
//    public String index(@ModelAttribute("errors") String errors) {
//        System.out.println(errors);
//        return "index";
//    }
//    @RequestMapping("/errors")
//    public String errors(RedirectAttributes redirectAttributes){
//        redirectAttributes.addFlashAttribute("errors", "A test errror!");
//        return "redirect:/";
//    }
	
//	@RequestMapping(path="/code", method=@RequestMethod.POST)
//	public String code(@RequestParm())
}