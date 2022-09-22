package nikilesh.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import nikilesh.springframework.sfgdi.services.GreetingService;

@Controller
public class i18nController {

	private final GreetingService greetingService;
	
	@Autowired
	public i18nController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
