package com.ironhack.helloweb.service;

import com.ironhack.helloweb.dto.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService {

           List<Coffee> ListOfCoffees = List.of(
                new Coffee("Yeah", "hello", 45,"we"),
                new Coffee("asae", "Colombasdia", 1,"sdsd"),
                new Coffee("tuuu", "assssss", 0,"bro1111wn")
        );

    @Override
    public Coffee getById(int id) {
        return ListOfCoffees.get(id);
    }

}
