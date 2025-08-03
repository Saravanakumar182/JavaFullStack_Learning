package com.cognizant.spring_learn;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.cognizant.spring_learn.controller.CountryController;

@SpringBootTest
class SpringLearnApplicationTests {

	@Autowired
	private CountryController countryController;

	@Autowired
	private MockMvc mvc;

	@Test
	void contextLoads() {
		assertNotNull(countryController);
		assertNotNull(mvc);
	}

	@Test
	void  testGetCountry() throws Exception{
		ResultActions action = mvc.perform(get("/"))
	}


}
