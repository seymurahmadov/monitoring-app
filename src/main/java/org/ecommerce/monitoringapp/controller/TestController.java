package org.ecommerce.monitoringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String test() {
        return "Test API";
    }

    @GetMapping("/error")
    public String testError() {
        throw new RuntimeException("testError");
    }
}
