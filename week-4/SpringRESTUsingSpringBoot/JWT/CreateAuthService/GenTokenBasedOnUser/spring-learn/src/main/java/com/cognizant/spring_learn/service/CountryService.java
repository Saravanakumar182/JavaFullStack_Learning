package com.cognizant.spring_learn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    
    public Country getCountry(String code){
        return (Country) context.getBean(code,Country.class);
    }

    @SuppressWarnings("unchecked")
    public Country getCountryByCode(String code) {
        LOGGER.info("START - getCountry");
        List<Country> countryList = context.getBean("countryList", List.class);
        Country country = countryList.stream()
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseThrow(()-> new CountryNotFoundException("country not found"));

        context.close();

        LOGGER.info("END - getCountry");
        return country;
    }

    @SuppressWarnings("unchecked")
    public List<Country> getCountries(){
        LOGGER.debug("Called getCountries service");
        return (List<Country>)context.getBean("countryList", List.class);
    }
}
