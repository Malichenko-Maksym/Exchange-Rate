package com.example.demo;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/")
public class HelloController{

    @GetMapping
	public String greeting(@RequestParam(name="name", required=true, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "main";
	} 

    
  
}