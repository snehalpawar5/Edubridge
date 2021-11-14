package com.Project.PlacementManagementSystem;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) 
	{
		List<Student> listStudents = service.listAll();
		model.addAttribute("listStudents",listStudents);
		
		return "login";
	}
	
	@RequestMapping("/index")
	public String index(Model model) 
	{
		List<Student> listStudents = service.listAll();
		model.addAttribute("listStudents",listStudents);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String newstudent(Model model)
	{
		Student student = new Student();
		model.addAttribute("student",student);
		
		return "newstudent";
	}
	
	@RequestMapping("/login")
	public String login(Model model)
	{
		Student student = new Student();
		model.addAttribute("student",student);
		
		return "login";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student)
	{
		service.save(student);
		
		return "save";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditStudentPage(@PathVariable(name="id") Long id)
	{
		ModelAndView mav = new ModelAndView("Edit");
		Student student = service.get(id);
		mav.addObject("student",student);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable(name="id") Long id)
	{
		service.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/logout")
	public String logout(Model model)
	{
		Student student = new Student();
		model.addAttribute("student",student);
		
		return "logout";
	}
	
	@RequestMapping("myjobs")
	public String myjobs(Model model)
	{
		Student student = new Student();
		model.addAttribute("student",student);
		
		return "myjobs";
	}
}
