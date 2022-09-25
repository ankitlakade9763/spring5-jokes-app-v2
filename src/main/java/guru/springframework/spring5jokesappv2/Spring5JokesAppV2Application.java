package guru.springframework.spring5jokesappv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring5jokesappv2.controller.Jokes;

@SpringBootApplication
public class Spring5JokesAppV2Application {

	public static void main(String[] args) {
		//SpringApplication.run(Spring5JokesAppV2Application.class, args);
		ApplicationContext ctx = SpringApplication.run(Spring5JokesAppV2Application.class, args);
		Jokes J=(Jokes)ctx.getBean("jokes");
		
		
	}

}
