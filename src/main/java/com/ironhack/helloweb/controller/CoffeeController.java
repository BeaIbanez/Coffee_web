package com.ironhack.helloweb.controller;

import com.ironhack.helloweb.dto.Coffee;
import com.ironhack.helloweb.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/coffees")
public class CoffeeController {
    @Autowired
    public CoffeeService service;

    @GetMapping(path = "/{id}")
    public Coffee getOne(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping(path = "/all")
    public List<Coffee> getAll() {
        return List.of(
                new Coffee("Yeah", "hello", 45, "we"),
                new Coffee("asae", "Colombasdia", 1, "sdsd"),
                new Coffee("tuuu", "assssss", 0, "bro1111wn")
        );

    }
}


