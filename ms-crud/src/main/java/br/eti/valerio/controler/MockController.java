package br.eti.valerio.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mock-service")
public class MockController {

	@GetMapping(value = "getMock")
	public String getMock() {
		return "Mock Válido";
	}
	
}
