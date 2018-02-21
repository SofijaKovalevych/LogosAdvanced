package ua.shop.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.shop.entity.Student;
import ua.shop.entity.StudentDegree;
import ua.shop.entity.StudentGender;
import ua.shop.entity.WorkQualification;
import ua.shop.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@ModelAttribute("studentModel")
	public Student getForm() {
		return new Student();
	}
	
	@GetMapping
	public String showAdd(Model model) {
		
		LinkedHashMap<String, String> countryOptions = new LinkedHashMap<>();
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("UA", "Ukraine");
		countryOptions.put("CH", "China");
		countryOptions.put("II", "IIndia");
		
		LinkedHashMap<String, Integer> selectAge = new LinkedHashMap<>();
		for(int i = 15; i <=65; i++) {
			selectAge.put(String.valueOf(i), i);
		}
		model.addAttribute("age", selectAge);
		model.addAttribute("country", countryOptions);
		model.addAttribute("gender", StudentGender.values());
		model.addAttribute("degree", StudentDegree.values());
		model.addAttribute("qualification", WorkQualification.values());
		
		 return "student/add";
		
	}
	
	@GetMapping("/list")
	public String listOfAllStudents() {
		return "student/list";
	}
	
	@PostMapping("/add")
	public String save(@ModelAttribute("studentModel") Student student) {
		studentService.saveStudent(student);
		return "redirect:/student/list";
	}

}
