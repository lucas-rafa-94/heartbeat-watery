package com.heartbeat.watery.controller;

import com.heartbeat.watery.service.WaterfyCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/heartbeat")
public class HeartbeatController {
    @Autowired
    WaterfyCaller waterfyCaller;

    @GetMapping
    public void check(){
        waterfyCaller.check();
    }
}
