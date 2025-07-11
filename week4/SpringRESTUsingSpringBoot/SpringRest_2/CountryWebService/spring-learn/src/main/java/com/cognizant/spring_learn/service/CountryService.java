package com.cognizant.spring_learn.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;

@Service
public class CountryService {
    
    Logger LOGGER = LoggerFactory.getLogger(getClass());

    private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    public Country getCountry (String c){
        LOGGER.debug("Called getCountry with country "+c);
        return (Country)context.getBean(c, Country.class);
    }
    
}
