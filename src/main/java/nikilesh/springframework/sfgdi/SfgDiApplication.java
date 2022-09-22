package nikilesh.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;
import nikilesh.springframework.sfgdi.controllers.ConstructorInjectedController;
import nikilesh.springframework.sfgdi.controllers.MyController;
import nikilesh.springframework.sfgdi.controllers.PropertyInjectedController;
import nikilesh.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		
		PropertyInjectedController propertyInjectedController = context.getBean("propertyInjectedController", PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());
		
		ConstructorInjectedController constructorInjectedController = context.getBean("constructorInjectedController", ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
		
		SetterInjectedController setterInjectedController = context.getBean("setterInjectedController", SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());
		
		MyController myController = context.getBean("myController", MyController.class);
		System.out.println(myController.sayHello());
	}

}
