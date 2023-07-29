package com.anubhavtrainings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anubhavtrainings.myclasses.Laptop;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Laptop appleI180 = context.getBean(Laptop.class);
		appleI180.setBrandName("Apple");
		System.out.println(appleI180.toString());
	}

}
