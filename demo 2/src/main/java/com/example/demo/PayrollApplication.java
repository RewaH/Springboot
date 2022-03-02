package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import student.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class PayrollApplication {

	public static void main(String[] args) {

		SpringApplication.run(PayrollApplication.class, args);
	}
/*
@GetMapping
	public String hello()
{
*\
	return "hi";
}
/*
@RestController  //
//WE will go to the localhost and read from it

public class PayrollApplication {

	public static void main(String[] args) {

		SpringApplication.run(PayrollApplication.class, args);
	}

	@GetMapping   // use this annotation to get something from our server
	// to make this class serve rest end points
	//check the APi results here http://localhost:8080/

public List <Student> hello()
	{
		return List.of(new Student(
				1L,
				"Rewaa",
				"rrrr@gmaikl",
				LocalDate.of(1992,Month.FEBRUARY,6),
				29
		));
	}*/


}




/*public String hello(){
	return "Hello World";*/

	/*public List <String> hello(){
		return List.of("Hello"," World");
	}*/