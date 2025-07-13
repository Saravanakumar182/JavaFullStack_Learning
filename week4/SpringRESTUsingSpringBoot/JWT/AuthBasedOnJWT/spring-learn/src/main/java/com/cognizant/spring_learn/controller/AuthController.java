package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.service.JWTService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);
    
    @Autowired
    private JWTService jwtService;

    private String getUser(String authHeader){
        String creds = authHeader.substring(6);
        byte[] deCreds = Base64.getDecoder().decode(creds);
        return new String(deCreds).split(":")[0];
    }

    @GetMapping(value = "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,String> authenticate (@RequestHeader("Authorization") String header){
        LOGGER.info("Authenticate() - START");
        LOGGER.debug("Authorization - Header : {}",header);

        String creds = this.getUser(header);
        LOGGER.debug("Creds - {}", creds);

        Map<String,String> tokens = new HashMap<>();
        String token = jwtService.generateToken(creds);
        tokens.put("token",token);

        LOGGER.info("Authenticate() - END");
        return tokens;
    }
}
