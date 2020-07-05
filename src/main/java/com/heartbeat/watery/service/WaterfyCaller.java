package com.heartbeat.watery.service;

import com.heartbeat.watery.model.Response;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WaterfyCaller {
    public Response check(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange("https://prod.waterfy.net", HttpMethod.GET , null, String.class);
        return  new Response("online");
    }
}
