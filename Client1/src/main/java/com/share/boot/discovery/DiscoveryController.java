package com.share.boot.discovery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryController {
    @Autowired
    DiscoveryService discoveryService;
 
    @GetMapping(value = "/services")
    public List<String> services() {
        return discoveryService.getServices();
    }

}