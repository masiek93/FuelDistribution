package wroc.pwr.controller;

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

import wroc.pwr.dto.CisternForm;
import wroc.pwr.model.Cistern;
import wroc.pwr.model.Container;
import wroc.pwr.service.CisternService;
import wroc.pwr.service.ContainerService;

@Controller
public class CisternController {
	@Autowired
	private CisternService cisternService;
	
	@Autowired
	private ContainerService containerService;
	
	@RequestMapping(value = "/cysterna")
	public String listCisterns(ModelMap model) {
		List<Cistern> cisternList = cisternService.getListOfAllCisterns();
		model.addAttribute("cisternList", cisternList);
		return "cisternList";
	}
	
	@RequestMapping(value = "/cysterna/dodaj")
	public String newCistern(HttpServletRequest request, @ModelAttribute("cisternForm") @Valid CisternForm cisternForm, BindingResult result) {
		if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
			
			Cistern cistern = new Cistern();
			cistern.setName(cisternForm.getFormCisternName());
			if(cisternForm.getFormCisternType()==1){
				/* 5 containers (3000 liters) */
				Container container = new Container(cistern, 3000, 0);
				Container container2 = new Container(cistern, 3000, 0);
				Container container3 = new Container(cistern, 3000, 0);
				Container container4 = new Container(cistern, 3000, 0);
				Container container5 = new Container(cistern, 3000, 0);
				
				cistern.getContainerList().add(container);
				cistern.getContainerList().add(container2);
				cistern.getContainerList().add(container3);
				cistern.getContainerList().add(container4);
				cistern.getContainerList().add(container5);
				cistern.setCapacity(15000);
				cistern.setStatus(-1);
				cistern.setNumberOfEmptyContainers(5);
				
				cisternService.addCistern(cistern);
				/*containerService.addContainer(container);
				containerService.addContainer(container2);
				containerService.addContainer(container3);
				containerService.addContainer(container4);
				containerService.addContainer(container5);*/
			}else{
				/* 3 containers (3000 liters) and 2 containers 4000 liters */
				Container container = new Container(cistern, 3000, 0);
				Container container2 = new Container(cistern, 3000, 0);
				Container container3 = new Container(cistern, 3000, 0);
				Container container4 = new Container(cistern, 4000, 0);
				Container container5 = new Container(cistern, 4000, 0);
				
				cistern.getContainerList().add(container);
				cistern.getContainerList().add(container2);
				cistern.getContainerList().add(container3);
				cistern.getContainerList().add(container4);
				cistern.getContainerList().add(container5);
				cistern.setCapacity(17000);
				cistern.setStatus(-1);
				cistern.setNumberOfEmptyContainers(5);
				
				cisternService.addCistern(cistern);
/*				containerService.addContainer(container);
				containerService.addContainer(container2);
				containerService.addContainer(container3);
				containerService.addContainer(container4);
				containerService.addContainer(container5);*/
			}
			return "redirect:/cysterna";
		}
		return "addCistern";
	}
	
	@RequestMapping(value = { "/usun-{id}-cysterne" }, method = RequestMethod.GET)
    public String deleteCistern(@PathVariable int id) {
        cisternService.removeCisternById(id);
        return "redirect:/cysterna";
    }
}
