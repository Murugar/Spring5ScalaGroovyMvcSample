package com.iqmsoft.app.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import org.springframework.stereotype.Controller

@Controller
class SomeController {
	@RequestMapping("/groovy")
	public ModelAndView helloWorld() {
		
		return new ModelAndView("test")
	}
}