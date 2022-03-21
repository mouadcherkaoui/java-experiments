package org.dynamic.mediator.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.dynamic.core.TypesResolver;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		TypesResolver.Register(ITest.class, new Test());
		SpringApplication.run(DemoApplication.class, args);
	}

}
