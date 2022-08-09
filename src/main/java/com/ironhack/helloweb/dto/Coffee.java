package com.ironhack.helloweb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Coffee {
    private String name;
    private String origin;
    private int price;
    private String color;
}
