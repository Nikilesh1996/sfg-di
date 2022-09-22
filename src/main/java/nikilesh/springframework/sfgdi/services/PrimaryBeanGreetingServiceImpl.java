package nikilesh.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service 
public class PrimaryBeanGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello from primary greeting service";
	}
	
}
