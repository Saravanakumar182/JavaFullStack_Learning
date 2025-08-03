package com.cognizant.spring_learn.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

    @GetMapping("/authenticate")
    public Map<String,String> authenticate (@RequestHeader("Authorization") String header){
        LOGGER.info("Authenticate() - START");
        LOGGER.debug("Authorization - Header : {}",header);

        Map<String,String> tokens = new HashMap<>();
        tokens.put("token","");

        LOGGER.info("Authenticate() - END");
        return tokens;
    }
}
