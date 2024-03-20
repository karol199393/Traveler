package com.example.Traveler.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    public String getName(boolean a) {
        if(a)
        {
            return "Hello";
        }
        else{
            return "Goodbye";
        }
    }


}
