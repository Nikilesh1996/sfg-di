package nikilesh.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nikilesh.springframework.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
