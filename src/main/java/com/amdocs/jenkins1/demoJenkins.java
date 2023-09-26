package com.amdocs.jenkins1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoJenkins {
	@GetMapping("/get")
	public String show() {
		return "Name : Sharon \nAddress : Pune\nCompany : Amdocs";
	}
}
