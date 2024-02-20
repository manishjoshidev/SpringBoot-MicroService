package com.programming.orderservice;

//import com.programming.orderservice.config.WebClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import(WebClientConfig.class)
@ComponentScan(basePackages = "com.programmingtechie.orderservice")
public class OrderServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
}
