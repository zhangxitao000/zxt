package com.bjsxt.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }


    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String sayHello(){
        User user = new User();
        user.setId("1");
        user.setName("xxxx");
        return "hello world"+user.toString();
    }
}
