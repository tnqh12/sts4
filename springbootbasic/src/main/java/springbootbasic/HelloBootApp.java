package springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBootApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloBootApp.class, args);
		System.out.print("Hello Spring Boot!!");
	}

}
