package com.nexient.practice;

import java.time.ZoneId;
import java.util.TimeZone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller // IDs class as a MVC controller
public class MainController {

	@RequestMapping({ "/", "/home", "/index", "/greeting", "/frontpage",
		"/main" })
	/**
	 * @param model
	 *             Provided by framework to engage with View
	 * @return The templates/xxx.html to use for the View (in this case,
	 *         frontpage.html)
	 */
	public String greeting(final Model model) {
		// Get user's TimeZone
		ZoneId tz = TimeZone
			.getTimeZone(
				SessionLocaleResolver.TIME_ZONE_SESSION_ATTRIBUTE_NAME)
			.toZoneId();
		// Greet with user's time of day
		model.addAttribute("timeOfDay", TimeOfDay.greeting(tz));
		return "frontpage";
	}

}