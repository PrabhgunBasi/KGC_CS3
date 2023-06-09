package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String nane, int age, Address address) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWolrdConfiguration {
	
	@Bean
	public String name() {
		return "Prabhgun";
	}
	@Bean
	public int age() {
		return 17;
	}
	@Bean
	public Person person() {
		return new Person("Akalsukh",16, new Address("Trump Tower", "WA"));
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		//name,age,address2
		return new Person(name, age, address3);
	}
	@Bean(name = "address2")
	public Address address() {
		return new Address("1600 Pennsylvania Ave NW", "DC");
	}
		
	
}
