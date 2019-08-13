package com.verizon.springmicroservicedemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/message")
public class RestController {
	@Value("${msg}")
	private String msg;
	@RequestMapping
public String getMessage() {
	return "Message is:"+msg;
}
}
