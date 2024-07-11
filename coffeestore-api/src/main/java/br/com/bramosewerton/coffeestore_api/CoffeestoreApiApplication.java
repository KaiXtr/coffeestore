package br.com.bramosewerton.coffeestore_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CoffeestoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeestoreApiApplication.class, args);
	}

}
