package com.transdev.mobiservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AngularController {
  
    @GetMapping("/mobiservices-angular-app/**")
    public String angularApp() {
        return "forward:/index.html";
    }
}