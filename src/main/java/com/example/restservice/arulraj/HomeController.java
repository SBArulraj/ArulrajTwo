package com.example.restservice.arulraj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1/arulraj")
public class HomeController {

    @GetMapping("page1")
    public String page1(){
        return "Page 1";
    }
}
