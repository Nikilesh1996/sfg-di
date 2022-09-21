package nikilesh.springframework.sfgdi;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import nikilesh.springframework.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = context.getBean("myController", MyController.class);
			
		String result = myController.sayHello();
		System.out.println("From main: " + result);
		Date date = new Date();
	}

}
