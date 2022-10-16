package sanwich.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping()
public class SandwichController {

    @GetMapping
    public String showForm() {
        return "/sandwich";
    }

    @GetMapping("/sandwich")
    public String addCondiment(@RequestParam String [] a, Model model) {
        model.addAttribute("lettuce", a );

        return "/sandwich";
    }
}
