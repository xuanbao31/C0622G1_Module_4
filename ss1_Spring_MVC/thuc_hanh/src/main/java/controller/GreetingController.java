package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GreetingController {
    @GetMapping("/")

    public String greeting(@RequestParam String name, Model model){
        model.addAttribute("name1" , name);
        return "/index";
    }

}
