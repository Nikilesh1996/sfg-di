package nikilesh.springframework.sfgdi.controllers;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nikilesh.springframework.sfgdi.services.ConstructorInjectedGreetingServiceImpl;

class SetterInejctedControllerTest {
	
	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorInjectedGreetingServiceImpl());
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
