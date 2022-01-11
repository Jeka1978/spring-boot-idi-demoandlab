package com.idi.springbootididemoandlab.controllers;

import com.idi.idilogger.IdiLogger;
import com.idi.springbootididemoandlab.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@ConditionalOnProperty(value = "runtime.env",havingValue = "PROD")
public class Dimo4kaController {

    @Autowired
    private IdiLogger logger;


    @PostMapping("/api/person/save")
    public String save(@RequestBody Person person) {
        System.out.println(person + " was saved");
        return "OK";
    }


    @GetMapping("/api/person/fromdata/{age}")
    public Person getPersonFromPath(@RequestParam String name, @PathVariable int age) {
        return Person.builder().age(age).name(name.toUpperCase()).build();
    }

    @GetMapping("/api/person/fromdata")
    public Person getPersonFromData(@RequestParam String name, @RequestParam int age) {
        return Person.builder().age(age).name(name.toUpperCase()).build();
    }

    @GetMapping("/api/hi")
    public String helloWithName(@RequestParam String name) {
        return "hello " + name.toUpperCase();
    }

    @GetMapping("/api/hello")
    public String hello(){
        logger.info("123");
        logger.setInfoEnabled(true);
        logger.info("456");
        return "hello Dima!!!";
    }

    @GetMapping("/api/person")
    public Person getPerson() {
        return Person.builder().name("Dimo4ka").age(17).build();
    }

}
