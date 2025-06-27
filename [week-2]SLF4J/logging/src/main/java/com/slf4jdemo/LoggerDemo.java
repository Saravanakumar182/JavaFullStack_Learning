package com.slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LoggerDemo {
private static final Logger logger = LoggerFactory.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        
        logger.trace("This is a trace message");
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        
        try {
            throw new RuntimeException("Sample exception for logging");
        } catch (Exception e) {
            logger.error("An error occurred during processing", e);
        }
    }
}
