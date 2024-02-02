package com.learn.springboot.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learn.springboot.dao.Activity;

@RestController
public class RestSpringBootController {
    Logger logger = LoggerFactory.getLogger(RestSpringBootController.class);

     @GetMapping(value="/getActivity")
    public String getActivity() {
        String uri = "https://www.boredapi.com/api/activity";
        RestTemplate restTemplate = new RestTemplate();
        Activity resultantActivity = restTemplate.getForObject(uri,Activity.class);
        String resultString = resultantActivity.getActivity();
        logger.debug("Activity name: ",resultString);
        return resultString;
    }    
}
