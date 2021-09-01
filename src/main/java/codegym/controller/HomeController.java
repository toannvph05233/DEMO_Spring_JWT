package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "home";

    }

    @GetMapping("/admin")
    public String toan() {
        return "admin";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

}
