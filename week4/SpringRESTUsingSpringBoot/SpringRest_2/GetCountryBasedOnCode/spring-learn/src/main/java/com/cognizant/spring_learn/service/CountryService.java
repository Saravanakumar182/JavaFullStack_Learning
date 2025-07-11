package com.cognizant.spring_learn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;

@Service
public class CountryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);

    @SuppressWarnings("unchecked")
    public Country getCountryByCode(String code) {
        LOGGER.info("START - getCountry");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = context.getBean("countryList", List.class);

        Country country = countryList.stream()
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElse(null);

        context.close();

        LOGGER.info("END - getCountry");
        return country;
    }
}
