package nikilesh.springframework.sfgdi.controllers;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nikilesh.springframework.sfgdi.services.GreetingService;
import nikilesh.springframework.sfgdi.services.ConstructorInjectedGreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	public void setUp() {
		GreetingService service = new ConstructorInjectedGreetingServiceImpl();
		controller = new ConstructorInjectedController(service);
	}
	
	@Test
	public void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
