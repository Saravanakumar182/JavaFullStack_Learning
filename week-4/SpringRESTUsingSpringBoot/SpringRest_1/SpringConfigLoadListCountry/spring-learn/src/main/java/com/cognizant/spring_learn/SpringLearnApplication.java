package com.cognizant.spring_learn;


import java.util.List;

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
		displayCountries();

	}

	public static void displayCountries(){
		LOGGER.debug("Running displaycountry()");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		
		List<Country> countryList = (List<Country>) context.getBean("countryList",java.util.List.class);
	

		for(Country c : countryList){
			LOGGER.debug("{}",c.toString());
		}
	}

}
