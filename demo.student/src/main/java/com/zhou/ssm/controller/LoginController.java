package com.zhou.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("manager")
public class LoginController { 
	
    @RequestMapping("login") 
    public ModelAndView findList(Model model) {
    	ModelAndView  mv = new ModelAndView(); 
    	mv.setViewName("common/login");
    	return mv;
       
    }

}
