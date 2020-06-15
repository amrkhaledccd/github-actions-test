package com.example.GitHubActios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingEndpoint {

    @Autowired private GreetingService greetingService;

    @GetMapping("/greeting/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String sayHello(@PathVariable String name) {
        return greetingService.sayHello(name);
    }
}
