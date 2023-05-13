package com.dependecyinjection.dependencyinjection;

import com.dependecyinjection.dependencyinjection.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");
		controller.sayHello();
	}

}
