package main.uangku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @GetMapping("/income")
    public String income() {
        return "income";
    }

    @GetMapping("/expanse")
    public String expanse() {
        return "expanse";
    }
}