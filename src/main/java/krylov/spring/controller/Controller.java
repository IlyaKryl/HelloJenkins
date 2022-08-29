package krylov.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello_world";
    }

    @GetMapping("/jenkins")
    public String helloJenkins() {
        return "hello_jenkins";
    }
}
