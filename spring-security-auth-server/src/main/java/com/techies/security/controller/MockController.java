package com.techies.security.controller;

import org.springframework.boot.actuate.trace.http.HttpTrace.Principal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class MockController {

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public Principal getUser(Principal principal) {
		return principal;
	}

	@RequestMapping(value = "/getText", method = RequestMethod.GET)
	public String getText() {
		return "Hello";
	}

	/*
	 * @RequestMapping(value = "/getUser", method = RequestMethod.POST) public Principal
	 * getUser() { return principal; }
	 */
}
