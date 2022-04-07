package com.blogspot.varanasisoftwarejunction.vsjmysql.restcontrollers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @GetMapping("/other")

    public String doTest() {
        return String.format("Other");
    }
}