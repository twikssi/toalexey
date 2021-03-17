package by.alexey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlexeyController {

    @GetMapping("/alexey")
    public String alexey(){
        return "Alexey";
    }

}
