package com.berkaybarisalgun.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SayHelloController {

	@ResponseBody
	@RequestMapping("say-hello")
	public String sayHello() {
		return "Hello! What you gonna learn?";

	}

}
