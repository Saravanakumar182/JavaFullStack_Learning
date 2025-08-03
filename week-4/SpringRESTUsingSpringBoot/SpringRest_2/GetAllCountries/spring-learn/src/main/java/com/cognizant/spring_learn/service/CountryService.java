package com.cognizant.spring_learn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;

@Service
public class CountryService {
    
    Logger LOGGER = LoggerFactory.getLogger(getClass());

    private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    @SuppressWarnings("unchecked")
    public List<Country> getCountries(){
        LOGGER.debug("Called getCountries service");
        return (List<Country>)context.getBean("countryList", List.class);
    }
    
}
