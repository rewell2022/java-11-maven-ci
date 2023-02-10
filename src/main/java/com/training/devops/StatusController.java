package com.training.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    
    @GetMapping("/")
    public StatusResponse getStatus(){
        return new StatusResponse("online");
    }
}
