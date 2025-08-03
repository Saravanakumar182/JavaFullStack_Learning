package com.cognizant.spring_learn;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.cognizant.spring_learn.controller.CountryController;

@SpringBootTest
@AutoConfigureMockMvc
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
	void  testGetCountryIndia() throws Exception{
		ResultActions action = mvc.perform(get("/country/getIndia"));

		action.andExpect(status().isOk());

	}

	@Test
    public void testGetCountryByCode() throws Exception {
        ResultActions actions = mvc.perform(get("/country/getIndia"));
        actions.andExpect(status().isOk());
        actions.andExpect(jsonPath("$.code").exists());
    }

	@Test
    public void testGetCountryAndCode() throws Exception {
        ResultActions actions = mvc.perform(get("/country/getIndia"));
        actions.andExpect(status().isOk());
        actions.andExpect(jsonPath("$.code").exists());
        actions.andExpect(jsonPath("$.code").value("IN"));
    }

	@Test
	public void testGetCountryAndName() throws Exception{
		ResultActions actions = mvc.perform(get("/country/getIndia"));
		actions.andExpect(status().isOk());
		actions.andExpect(jsonPath("$.name").exists());
		actions.andExpect(jsonPath("$.name").value("India"));
	}
}