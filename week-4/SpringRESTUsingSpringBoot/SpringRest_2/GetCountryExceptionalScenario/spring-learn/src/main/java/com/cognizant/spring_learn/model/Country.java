package com.cognizant.spring_learn.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
    
    private String code;
    private String name;
    

    public Country() {
        LOGGER.debug("Inside Country constructor");
    }



    public String getCode() {
        LOGGER.debug("GetCode called");
        return code;
    }


    public void setCode(String code) {
        LOGGER.debug("SetCode called");
        this.code = code;
    }


    public String getName() {
        LOGGER.debug("GetName called");
        return name;
    }


    public void setName(String name) {
        LOGGER.debug("SetName called");
        this.name = name;
    }



    @Override
    public String toString() {
        return "Country [code=" + getCode() + ", name=" + getName() + "]";
    }  

    
}
