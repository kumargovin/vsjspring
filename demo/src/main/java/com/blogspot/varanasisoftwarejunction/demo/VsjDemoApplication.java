package com.blogspot.varanasisoftwarejunction.demo;

import com.blogspot.varanasisoftwarejunction.demo.newpackage.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class VsjDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VsjDemoApplication.class, args);
        System.out.println("hello");
    }

    @GetMapping("/")

    public String doWelcome() {
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

    @RequestMapping("/sub")

    public String doSub(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        return String.format("%s - %s = %s", a, b, a - b);
    }

    @PostMapping("/mul")

    public String doMul(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        return String.format("%s * %s = %s", a, b, a * b);
    }

    @GetMapping("/class")

    public Book sendClass() {
        return new Book("Apple", "Ball");
    }

    @RequestMapping("/classbook")
    public Book doSum(@RequestParam(value = "a", defaultValue = "0") String a, @RequestParam(value = "b", defaultValue = "0") String b) {
        return new Book(a, b);
    }

    @RequestMapping("/booklist")
    public List<Book> doList(@RequestParam(value = "a", defaultValue = "0") String a, @RequestParam(value = "b", defaultValue = "0") String b) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Apple", "Ball"));
        list.add(new Book("Cat", "Dog"));
        return list;
    }

}
