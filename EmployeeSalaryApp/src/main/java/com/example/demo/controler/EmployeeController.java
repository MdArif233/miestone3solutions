package com.example.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Employee;

@Controller
public class EmployeeController {


	@GetMapping("/index")
	public String ViewForm(Model model)
	{
			model.addAttribute("Addition", new Employee());
			return "index";
	}
	
	
	@PostMapping("/addtion")
	public String addForm(@ModelAttribute ("employee") Employee  employee,BindingResult result,Model model)
	{
		model.addAttribute("emplo",employee);
		return "calculate";
	}
	
	
}
