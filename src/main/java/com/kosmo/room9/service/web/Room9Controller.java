package com.kosmo.room9.service.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Room9Controller {
	@RequestMapping("/open.room9")
	public String open() throws Exception{
		System.out.println("들어옴?");
		return "open.tiles";
	}
}