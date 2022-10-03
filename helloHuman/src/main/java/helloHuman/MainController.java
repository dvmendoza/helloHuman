package helloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="first_name", defaultValue = "Human") String firstName, @RequestParam(value="last_name", required = false, defaultValue = "") String lastName, @RequestParam(value = "times", required = false) String times) {
		return "Hello " + firstName + lastName;
	}

}
