package com.project.clothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClothesController {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String homePage()
	{
		return "index";
	}
	
	@RequestMapping(value="/ajax",method = RequestMethod.GET)
	public String ajax()
	{
		return "home";
	}
}
