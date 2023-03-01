package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class HelloController {

	private double val1;
	private double val2;
	private double sum;


	public HelloController() {
		sum=0;
	}


	@GetMapping
	public String mainPage(Model model) {
		model.addAttribute("newCar", new ExchangeMoney());
		model.addAttribute("summa", sum);
		return "main";
	}

	@PostMapping("/add")
	public String Exchange(@ModelAttribute ExchangeMoney car) {
		val1=Double.parseDouble(car.getInputGBP());
		val2=Double.parseDouble(car.getInputPLN());    
		System.out.println(car);
		sum=val1*WebRequest.getRateFrom("http://api.nbp.pl/api/exchangerates/rates/a/gbp/?format=json")+val2;
		System.out.println(sum);

		return "redirect:/";
	}
	
	@GetMapping("/error")
	public String handleError() {
		return "main";
	}
}