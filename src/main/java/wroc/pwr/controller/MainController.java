package wroc.pwr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {

	//@Autowired
	//private NormalUserDAOImpl NormalUserRepo;

    @RequestMapping("/")
    public String przykladModelu(Model model) {
        model.addAttribute("message", "Witamy w Systemie umożliwiającym dokonywanie zamówień paliw płynnych");
        return "main";
    }
	
	/*@RequestMapping(value="/registration")
	public String dodajKotaformHandle(HttpServletRequest request, @ModelAttribute("regForm") @Valid RegistrationForm regForm, BindingResult result) {
		if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
			return "redirect:/model";
		}
		return "registration";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public String listPersons(Model model) {
        model.addAttribute("user", new NormalUser());
        model.addAttribute("listUsers", this.userService.listPersons());
        return "user";
    }*/
    
}
