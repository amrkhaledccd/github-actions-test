package com.example.GitHubActios;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
