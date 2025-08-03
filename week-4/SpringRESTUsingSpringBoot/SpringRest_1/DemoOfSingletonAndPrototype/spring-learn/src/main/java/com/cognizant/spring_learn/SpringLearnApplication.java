package com.cognizant.spring_learn;


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
		displayCountry();

	}

	public static void displayCountry(){
		LOGGER.debug("Running displaycountry()");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country1 = (Country) context.getBean("country1", Country.class);
		
		Country country2 = (Country) context.getBean("country1", Country.class);
		//LOGGER.debug("Country : {}", country1.toString());

		Country country3 = (Country) context.getBean("country2", Country.class);
		
		Country country4 = (Country) context.getBean("country2", Country.class);

		//LOGGER.debug("Country : {}", country2.toString());
		

	}

}
