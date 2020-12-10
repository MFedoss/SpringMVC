package ru.fedoseev.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
  
  // When the user enters "app adress"/hello-world we call hello_world.html file from views folder
  @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
   }

}
