package com.kosmo.room9;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/home.room9", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home.tiles";
	}
	
	@RequestMapping("/brythonTest.room9")
	public String brythonTest () throws Exception{	
		return "forward:/WEB-INF/views/home2.jsp";
	}
}
