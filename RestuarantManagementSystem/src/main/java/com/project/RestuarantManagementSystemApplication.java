package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.repository.EmployeeRepository;
import com.project.repository.MenuRepository;
import com.project.repository.OrderRepository;

@SpringBootApplication
public class RestuarantManagementSystemApplication {

	public static void main(String[] args) {
		 SpringApplication.run(RestuarantManagementSystemApplication.class, args);
		
	}

}
