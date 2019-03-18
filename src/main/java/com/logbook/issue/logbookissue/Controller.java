package com.logbook.issue.logbookissue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping
    public String sayHello(@RequestParam(defaultValue = "anonymous") String name) {
        return "Hello, " + name + " from " + Thread.currentThread().getName();
    }
}
