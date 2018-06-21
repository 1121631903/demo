package com.zhou.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhou.ssm.entity.Student;
import com.zhou.ssm.service.StudentService;
@Controller
@RequestMapping("student")
public class StudentController {
	@Resource
	private StudentService studentService;
 
	
    @RequestMapping("findList") 
    public ModelAndView findList() {
    	ModelAndView  mv = new ModelAndView();
    	List<Student> list= studentService.findList();
    	mv.addObject("list", list);
    	mv.setViewName("model/student-list");
    	return mv;
       
    }
    @RequestMapping("add") 
    public ModelAndView addView() {
    	ModelAndView  mv = new ModelAndView(); 
    	mv.setViewName("model/student-add");
    	return mv;
       
    }

}
