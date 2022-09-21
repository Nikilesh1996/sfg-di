package nikilesh.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import nikilesh.springframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService service) {
		greetingService = service;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
