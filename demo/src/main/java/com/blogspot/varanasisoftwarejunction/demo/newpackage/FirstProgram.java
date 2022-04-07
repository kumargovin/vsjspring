package com.blogspot.varanasisoftwarejunction.demo.newpackage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstProgram {
    @GetMapping("/other")

    public String doTest(){

        return String.format("other");
    }




}
