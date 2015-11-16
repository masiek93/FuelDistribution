package wroc.pwr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import wroc.pwr.dao.AddressDaoImpl;
import wroc.pwr.dto.AddressForm;

@Controller
public class AddressController {
	@Autowired
	private AddressDaoImpl addressRepo;

/*	@RequestMapping("/adres")
	public String przykladModelu(Model model) {
		model.addAttribute("message", "Dodawanie adresu:");
		return "adres";
	}*/

	@RequestMapping(value = "/adres")
	public String dodajAdresFormHandle(HttpServletRequest request,
			@ModelAttribute("addressForm") @Valid AddressForm addressForm,
			BindingResult result) {
		if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
			return "redirect:/adres/lista";
		}
		return "adres";
	}

/*	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("user", new NormalUser());
		model.addAttribute("listUsers", this.userService.listPersons());
		return "user";
	}*/

}
