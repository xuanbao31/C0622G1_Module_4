package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {
    @GetMapping("/")
public String calculate(){
        return "/index";
    }

    @PostMapping("/result")
    public  String changeMoney(@RequestParam int usd,Model model){
        int result = usd * 23000;
        model.addAttribute("result1",result);
        return "/index";
    }
}
