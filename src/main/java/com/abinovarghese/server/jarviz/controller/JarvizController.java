package com.abinovarghese.server.jarviz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@CrossOrigin
@Controller
public class JarvizController {
	
	@RequestMapping("/jarvis")
	public ModelAndView jarvis(){
		return new ModelAndView("jarvis");
	}
	
	@RequestMapping("/jarviz")
	public String  jarviz(Model model){
		return "jarvis";
	}
	
	@RequestMapping("/brain2.rive")
	public ModelAndView brain(){
		return new ModelAndView("brain");
	}
	
	@RequestMapping("/init.txt")
	public String init(){
		return "init";
	}
	
	@RequestMapping("/ResumePortal")
	public String resume( Model model) {
        return "forward:/resumePortal/index.html";
 }
	
	
}
