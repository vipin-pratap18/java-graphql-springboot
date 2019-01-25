package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class BlogGraphQLApp {
    private static final Logger LOG = LoggerFactory.getLogger(BlogGraphQLApp.class);


    public static void main(String[] args) {
        LOG.info("******************** Starting Blog Service at : {} ********************", new Date());
        SpringApplication.run(BlogGraphQLApp.class, args);
        LOG.info("******************** Blog Service started at : {} ********************", new Date());
    }

}