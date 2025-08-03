package com.cognizant.spring_learn;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringApplication.class);
	public static void main(String[] args) throws Exception{
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
	}

	static void displayDate() throws Exception{
		
		LOGGER.info("Start");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		java.util.Date date = format.parse("31/12/2018");
		LOGGER.debug(date.toString());

		LOGGER.info("END");
	}

}
