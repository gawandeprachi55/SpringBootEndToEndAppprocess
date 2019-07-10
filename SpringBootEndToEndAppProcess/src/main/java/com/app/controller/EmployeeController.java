package com.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Emplyee;
import com.app.service.EmployeeService;
import com.app.util.EmailUtil;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@Autowired
	private EmailUtil util;
	//1.show employee form backing obj
	@RequestMapping("/reg")
	public String showReg(Model map) {
		map.addAttribute("emplyee",new Emplyee());
		return "Register";
	}
	//2.read form data on click submit
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute Emplyee emplyee,
			@RequestParam MultipartFile fileOb,
			Model map) {
		//call service layer
		Integer id=service.saveEmployee(emplyee);
		util.send(emplyee.getEmail(),"hello", "new employee added", fileOb);
		map.addAttribute("message","Employee'"+id+"'created");
		//clean form backing object
		map.addAttribute("emplyee",new Emplyee());
		return "Register";

	}
	//3.fetch all rows from db to ui
	@RequestMapping("/all")
	public String showAll(Model map) {
		//fetch all rows from db
		List<Emplyee> obs=service.getAllEmployee();
		//send to ui
		map.addAttribute("list",obs);
		return "Data";
	}
	//4.delete row based on id
	@RequestMapping("/delete")
	public String remobe(@RequestParam Integer id) {
		//delete row based on id
		service.deleteEmployee(id);
		return "redirect:all";
	}
	//5.Edit employee
	@RequestMapping(value="/Edit")
	public String showEdit(
			@RequestParam Integer id,Model map
			) {
		//load obj from db
		Emplyee e=service.getEmployeeById(id);
		//form backing obj
		map.addAttribute("emplyee",e);
		map.addAttribute("Mode","EDIT");
		return "Register";



	}

}
