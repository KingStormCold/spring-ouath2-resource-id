package tuan.kul.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@PreAuthorize("#oauth2.hasScope('read')")
	@GetMapping(value = "/test")
	public String get() {
		return "OK";
	}

}
