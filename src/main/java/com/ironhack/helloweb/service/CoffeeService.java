package com.ironhack.helloweb.service;
import com.ironhack.helloweb.dto.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CoffeeService  {

    Coffee getById(int id);


}
