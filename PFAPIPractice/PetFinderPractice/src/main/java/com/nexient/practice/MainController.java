package com.nexient.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // IDs class as a MVC controller
public class MainController {

	@RequestMapping("/") // matches nexient.com/
	/**
	 * 
	 * @param name
	 *             from /greeting?name=xxx, defaults to 'World' if not present
	 * @param model
	 *             Provided by framework to engage with View
	 * @return The template.html to use for the View (in this case,
	 *         greeting.html)
	 */
	public String greeting(final Model model) {
		model.addAttribute("timeOfDay", TimeOfDay.greeting());
		return "frontpage";
	}

}