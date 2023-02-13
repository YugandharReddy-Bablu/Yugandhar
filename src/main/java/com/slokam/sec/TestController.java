package com.slokam.sec;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("test1")
	@PreAuthorize("hasRole('USER')")
	public String test1()
	{
		return "test1 HII";
	}
	
	@GetMapping("test2")
	@PreAuthorize("hasRole('ADMIN')")
	public String test2()
	{
		return "test2 HII";
	}
	
	@GetMapping("test3")
	@PreAuthorize("hasRole('MANAGER')")
	public String test3()
	{
		return "test3 HII";
	}
	
}
