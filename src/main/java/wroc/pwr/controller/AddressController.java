package wroc.pwr.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import wroc.pwr.dto.AddressForm;
import wroc.pwr.model.Address;
import wroc.pwr.service.AddressService;

@Controller
public class AddressController {
	@Autowired
	private AddressService addressService;

	@RequestMapping(value = "/adres")
	public String listAddresses(ModelMap model) {
		List<Address> addressList = addressService.getListOfAllAddresses();
		model.addAttribute("addresses", addressList);
		return "addressList";
	}

	@RequestMapping(value = "/adres/dodaj")
	public String newAddress(HttpServletRequest request, @ModelAttribute("addressForm") @Valid AddressForm addressForm, BindingResult result) {
		if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {

			Address address = new Address();
			address.setStreetName(addressForm.getFormStreetName());
			address.setBuildingNumber(addressForm.getFormBuildingNumber());
			address.setCity(addressForm.getFormCity());
			address.setPostalCode(addressForm.getFormPostalCode());
		
			addressService.addAddress(address);
			return "redirect:/adres";
		}
		return "addAddress";
	}
	
    @RequestMapping(value = { "/delete-{id}-address" }, method = RequestMethod.GET)
    public String deleteAddress(@PathVariable int id) {
        addressService.removeAddressById(id);
        return "redirect:/adres";
    }

/*	@RequestMapping(value = { "/edit-{id}-employee" }, method = RequestMethod.GET)
    public String editAddress(@PathVariable int id, ModelMap model) {
        Address address = addressService.getAddressById(id);
        model.addAttribute("address", address);
        return "addAddress";
    }*/
}
