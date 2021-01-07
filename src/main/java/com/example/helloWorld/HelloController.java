package com.example.helloWorld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@Slf4j
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        log.info("调用前");
        return "hello world";
    }

}