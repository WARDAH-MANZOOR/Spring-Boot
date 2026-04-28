package myFirstSpringBootProject;
// Spring Boot is a framework for building applications in java Programming language
// Spring boot makes it easy to create standalone , production-grade spring based applications
// that you can just run

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringBootProjectApplication.class, args);
	}

}
