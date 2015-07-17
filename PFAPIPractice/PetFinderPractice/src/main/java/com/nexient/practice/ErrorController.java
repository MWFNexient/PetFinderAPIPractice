package com.nexient.practice;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Redirects errors. Spring will provide a generic error page if none is
 * specified.
 */
public class ErrorController {
	@RequestMapping("/error")
	public String error() {
		return "error";
	}
}
