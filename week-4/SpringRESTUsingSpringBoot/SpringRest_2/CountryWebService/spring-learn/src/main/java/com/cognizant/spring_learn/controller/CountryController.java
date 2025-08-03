package com.cognizant.spring_learn.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
    Logger LOGGER = LoggerFactory.getLogger(getClass());    

    @Autowired
    private CountryService countryService;

    @GetMapping("/getIndia")
    public Country getIndia(){
        LOGGER.debug("Called getIndia get mapping");
        return countryService.getCountry("in");
    }
    
    @GetMapping("/getJapan")
    public Country getJapan(){
        LOGGER.debug("Called getJapan get mapping");

        return countryService.getCountry("jp");
    }
    @GetMapping("/getGerm")
    public Country getGermany(){
        LOGGER.debug("Called getGerm get mapping");

        return countryService.getCountry("de");
    }
    @GetMapping("/getUS")
    public Country getStates(){
        LOGGER.debug("Called getUS get mapping");

        return countryService.getCountry("us");
    }

}
