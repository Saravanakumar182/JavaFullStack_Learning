package com.cognizant.spring_learn;

import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	
	public static void main(String[] args) throws Exception{
		
		displayDate();
		//SpringApplication.run(SpringLearnApplication.class, args);
	}

	static void displayDate() throws Exception{
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml")) {

			SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

			java.util.Date date = format.parse("31/12/2018");

			System.out.println(date);

		}
	}

}
