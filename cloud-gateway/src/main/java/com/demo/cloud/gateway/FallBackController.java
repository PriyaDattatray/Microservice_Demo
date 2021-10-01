package com.demo.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod()
	{
		return "User service is taking longer than expected..."+
				"Please try again later..";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod()
	{
		return " service is taking longer than expected..."+
				"Please try again later..";
	}
	
	@GetMapping("/jwtServiceFallBack")
	public String jwtServiceFallBackMethod()
	{
		return "JWT service is taking longer than expected..."+
				"Please try again later..";
	}
	
	@GetMapping("/fileServiceFallBack")
	public String fileServiceFallBackMethod()
	{
		return "File service is taking longer than expected..."+
				"Please try again later..";
	}
	
	
}
