package com.blogspot.varanasisoftwarejunction.demo.newpackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Book {
    private String a, b;

    public Book(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public String getMurga() {
        return "Murga";
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Book{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
