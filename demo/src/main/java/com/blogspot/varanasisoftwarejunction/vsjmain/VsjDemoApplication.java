package com.blogspot.varanasisoftwarejunction.vsjmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication(scanBasePackages = { "com.blogspot.varanasisoftwarejunction"} )
//@SpringBootApplication
@RestController

public class VsjDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VsjDemoApplication.class, args);
        System.out.println("hello");
    }
    @GetMapping("/")

    public String index() {
        return "Welcome";
    }
    @GetMapping("/test")

    public String doTest(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s", name);
    }

    @GetMapping("/add")

    public String doAdd(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        return String.format("%s +  %s = %s", a, b, a + b);
    }

    @GetMapping(value = {"/doadd", "/doadd/{a}", "/doadd/{a}/{b}"})


    public String getBook(@PathVariable Optional<Integer> a, @PathVariable Optional<Integer> b) {
        int x = 0, y = 0;
        if (a.isPresent())
            x = a.get();
        if (b.isPresent())
            y = b.get();
        return String.format("%s +  %s = %s", x, y, x + y);
    }

    @GetMapping("/book")
    public ResponseEntity<Book> book() {
        try {
            Book book = new Book("The Recursion Sutras", "Recursion", 299);

                return ResponseEntity.ok(book);

        }
        catch (Exception ex)
        {
            return ResponseEntity.notFound().build();//Return Not Found
        }
    }
}
