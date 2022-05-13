package com.example.helloworld.entity;

import lombok.Data;

@Data
public class Pet {
    String name ;
    public Pet(String name) {
        this.name = name;
    }
}
