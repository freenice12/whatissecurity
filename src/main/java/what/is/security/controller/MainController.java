package what.is.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String front() {
		return "front";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
