package com.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWebApplication extends SpringBootServletInitializer {
	
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringWebApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initDB() {
		return (args) -> {
			repo.save(new Employee("John", 20010L));
			repo.save(new Employee("Peter", 20010L));
			repo.save(new Employee("Sam", 20010L));
		};
	}

}
