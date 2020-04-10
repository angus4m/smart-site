package com.cqxyd.smartsite.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping(value = "/login/userLogin")
	public String userLogin() {
		return "login";
	}
	
	@GetMapping(value = "/login/changePassword")
	public String changePassword() {
		return "admin-password-edit";
	}
	
}
