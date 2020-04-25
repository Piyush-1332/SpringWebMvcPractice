package com.cg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="/hello")
	public String display() {
		return "hello";
	}

	@RequestMapping(value = "/helloagain")
	public String redirect() {
		return "final";
	}
}