package fez;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FezToolsController {
	@RequestMapping("fezTools")
	public String sayHello() {
		return "hello world";
	}
}
