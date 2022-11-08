package com.spring.web;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public ModelAndView getEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		HashMap<String, List<Employee>> model = new HashMap<>();
		model.put("list", employees);
		return new ModelAndView("employeeList", model);
	}
	
	@PostMapping("/add")
	public String addEmployees(@ModelAttribute Employee emp,Model model) 
	{
		model.addAttribute("emp",emp);
		return "employeeForm";
	}

}
