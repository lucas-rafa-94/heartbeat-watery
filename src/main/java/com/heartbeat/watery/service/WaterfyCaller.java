package com.heartbeat.watery.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WaterfyCaller {
    public void check(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange("https://prod.waterfy.net", HttpMethod.GET , null, String.class);
        System.out.printf(response.getStatusCode().toString());
    }
}
