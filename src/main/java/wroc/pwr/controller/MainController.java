package wroc.pwr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

    @RequestMapping("/")
    public String przykladModelu(Model model) {
        model.addAttribute("message", "Witamy w Systemie umożliwiającym dokonywanie zamówień paliw płynnych");
        return "main";
    }
	
    
}
