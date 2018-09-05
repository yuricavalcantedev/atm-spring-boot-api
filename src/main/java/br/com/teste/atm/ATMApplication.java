package br.com.teste.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ATMApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ATMApplication.class, args);
	}
}
